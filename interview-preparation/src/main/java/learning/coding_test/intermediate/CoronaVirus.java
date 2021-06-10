package learning.coding_test.intermediate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Input : 
 * coronavirus
 * 3
 * abcde
 * crnas
 * onarous
 * 
 * Output : 
 * NEGATIVE
 * POSITIVE
 * NEGATIVE
 * 
*/

public class CoronaVirus {
	private static Scanner scan;
	private static char[] diseaseArray;

	public static void start() {
		scan = new Scanner(System.in);
		String checkString = scan.next();
		int numberOfPatient = scan.nextInt();
		List<String> inputList = new ArrayList<String>(numberOfPatient);
		for (int i = 0; i < numberOfPatient; i++) {
			String checkPatent = scan.next();
			inputList.add(checkPatent);
		}
		scan.close();
		diseaseArray = checkString.toCharArray();
		List<String> output = new LinkedList<String>();
		inputList.forEach(string -> {
			output.add(manageRecord(string));
		});
		output.forEach(System.out::println);
	}

	private static String manageRecord(String checkPatent) {
		char[] patentArray = checkPatent.toCharArray();
		int checkIndex = 0;
		Map<Boolean, Integer> map = new HashMap<Boolean, Integer>();
		for (int i = 0; i < patentArray.length; i++) {
			map = getNewIndex(checkIndex, patentArray[i]);
			checkIndex = map.get(true);
			if (checkIndex == -1)
				break;
		}
		if (checkIndex != -1) {
			return "POSITIVE";
		} else {
			return "NEGATIVE";
		}
	}

	private static Map<Boolean, Integer> getNewIndex(int index, char nextCharacter) {
		Map<Boolean, Integer> status = new HashMap<Boolean, Integer>(1);
		for (int i = index; i < diseaseArray.length; i++) {
			if (diseaseArray[i] == nextCharacter) {
				status.put(true, i);
				break;
			} else {
				status.put(true, -1);
			}
		}
		return status;
	}
}