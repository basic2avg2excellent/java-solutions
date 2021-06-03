package utility.util;

public class FormatConversion {
	
	public static boolean checkNumberFormat(String input) {	
		boolean numberFormat = false;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				numberFormat = true;
			} else{
				numberFormat = false;
				break;
			}
		}
		return numberFormat;
	}
	
	public static int stringToNumberConversion(String input) throws NumberFormatException{
		return Integer.parseInt(input);
	}
}