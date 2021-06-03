package theory.string.regular_expression;


import java.util.regex.Pattern;

public class RegexExample1 {
	public static void main(String[] args) {
		String input = "#like(#upper($(study id)))";
		String input2 = "$(study Id)";
		
		System.out.println(Pattern.matches("like?", input));
	}
}