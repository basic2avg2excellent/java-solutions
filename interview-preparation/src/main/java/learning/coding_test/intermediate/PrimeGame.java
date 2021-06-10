package learning.coding_test.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeGame {
	private static Scanner scan;
	public static void main(String[] args) throws Exception {
		scan = new Scanner(System.in);
		String input = scan.nextLine();
		int numberOfInput = Integer.parseInt(input);
		List<Integer> lowerValList = new ArrayList<Integer>(numberOfInput);
		List<Integer> higherValList = new ArrayList<Integer>(numberOfInput);
		List<Integer> outputList = new ArrayList<Integer>(numberOfInput);
		for(int i=0; i<numberOfInput; i++) {
			String string = scan.nextLine();
			String arrayInput[] = string.split(" ");
			lowerValList.add(i, Integer.parseInt(arrayInput[0]));
			higherValList.add(i, Integer.parseInt(arrayInput[1]));
		}
		for(int i=0; i<numberOfInput; i++) {
			outputList.add(i, primeNumbers(lowerValList.get(i), higherValList.get(i)));
		}
		for(int i=0; i<numberOfInput; i++) {
			System.out.println(outputList.get(i));
		}
	}
	
	private static int primeNumbers(int lowerRange, int higherRange) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for(int i = lowerRange; i <= higherRange; i++) {
			boolean primeNumCheck = checkPrimeNum(i);
			if(primeNumCheck) {
				primeNumbers.add(i);
			}
		}
//		System.out.println(primeNumbers);
		if(primeNumbers.size()==1) {
			return 0;
		}else if(primeNumbers.size() > 1) {
			return primeNumbers.get(primeNumbers.size()-1) - primeNumbers.get(0);
		}else {
			return -1;
		}
	}
	
	private static boolean checkPrimeNum(int number) {
		boolean primeNumCheck = false;
		if(number == 0 || number == 1 ) return false;
		if(number == 2 || number ==3) return true;
		for(int i = 2; i<=number/2 ; i++) {
			if(number % i == 0 ) {
				primeNumCheck = false;
				break;
			}else {
				primeNumCheck = true;
			}
		}
		return primeNumCheck;
	}
}