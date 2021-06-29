package learning.coding_test.intermediate;

/** 
 * Input						Output
 * abcdVariableName				abcd_variable_name
 * abcd_variable_name			abcdVariableName
 */
 public class RenameString {
	public static String reNameString(String input) {
		String output = "";
		if(input.contains("_")) {
			output = remove_(input);
		}else {
			output = add_(input);
		}
		return output;
	}

	private static String add_(String input) {
		// char[] inputArray = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				sb.append("_");
				sb.append(Character.toLowerCase(input.charAt(i)));
			}else {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}

	private static String remove_(String input) {
		// char[] inputArray = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='_') {
				sb.append(Character.toUpperCase(input.charAt(i+1)));
				i++;
			}else {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}
}