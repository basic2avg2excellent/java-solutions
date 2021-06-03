package theory.string;

import java.util.Base64;

public class Base64Conversion {

	public static void main(String[] args) {
		String input = "Base 64 Conversion";
		System.out.println("Input String : "+input);
		
		String base64ConvertedString = Base64.getEncoder().encodeToString(input.getBytes());
		System.out.println("Encoded String : "+base64ConvertedString);
		
		String actualString = new String(Base64.getDecoder().decode(base64ConvertedString));
		System.out.println("Decoded Actual String : "+actualString);
	}
}