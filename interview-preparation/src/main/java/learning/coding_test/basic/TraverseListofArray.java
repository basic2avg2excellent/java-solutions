package learning.coding_test.basic;

import java.util.Arrays;
import java.util.List;
import utility.input.ArrayInput;

public class TraverseListofArray {

	public static void main(String[] args) {
		List<String> input = Arrays.asList(ArrayInput.STRING_RANDOM_ARRAY);
		//forEach is a terminal operation
		input.stream().forEach(System.out::println);
	}
}