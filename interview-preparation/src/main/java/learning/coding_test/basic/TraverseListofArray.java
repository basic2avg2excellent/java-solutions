package learning.coding_test.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import utility.input.ArrayInput;

public class TraverseListofArray {

	public static void main(String[] args) {
		List<String> input = Arrays.asList(ArrayInput.STRING_RANDOM_ARRAY);
		/**using for-each*/
		for(String string : input){
			System.out.print(string+" ");
		}

		/**using java 8*/
//		input.stream().forEach(System.out::print);

		/**using Iterator*/
		Iterator<String> iterator = input.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
}