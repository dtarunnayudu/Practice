import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		String str = "I am a String. Yes, I am.";
		System.out.println(str.replaceAll("I", "You").replaceAll("am", "are"));

		String alphanumeric = "abcDeeF12ghhiiiijk199z";
		System.out.println(alphanumeric.replaceAll(".", "X"));
		System.out.println("==============================");

		// ^ and $ boundary matchers
		alphanumeric = "abcDeeF12ghhiiiijk199z";
		System.out.println(alphanumeric.replaceAll("^abcDee", "X"));
		System.out.println(alphanumeric.replaceAll("jk199z$", "X"));
		System.out.println("==============================");

		// matches method
		alphanumeric = "abcDeeF12ghhiiiijk199z";
		System.out.println(alphanumeric.matches("abcDee"));
		System.out.println(alphanumeric.matches("^abcDee"));
		System.out.println(alphanumeric.matches("abcDeeF12ghhiiiijk199z"));
		System.out.println(alphanumeric.matches("^abcDeeF12ghhiiiijk199z$"));
		System.out.println("==============================");

		// Regex to parse a character or a set of characters
		alphanumeric = "abcDeeF12ghhiiiijk199z";
		System.out.println(alphanumeric.replaceAll("[aei]", "X"));
		System.out.println(alphanumeric.replaceAll("[^aei]", "X"));
		System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
		System.out.println("Harry".replaceAll("[Hh]arry", "X"));

		// Range
		alphanumeric = "abcDeeF12ghhiiiijk199z";
		System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));
		System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));
		System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X"));
		System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
		System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
		System.out.println(alphanumeric.replaceAll("[^0-9]", "X"));
		System.out.println(alphanumeric.replaceAll("\\d", "X"));
		System.out.println(alphanumeric.replaceAll("\\D", "X"));
		System.out.println(alphanumeric.replaceAll("\\w", "X"));

		// Quantifiers
		alphanumeric = "abcDeeeF12ghhiiiijk199z";
		System.out.println(alphanumeric.replaceAll("^abcDe{2}", "X"));
		System.out.println(alphanumeric.replaceAll("^abcDe+", "X"));
		System.out.println(alphanumeric.replaceAll("^abcDe{1,2}", "X"));
		System.out.println("====================================");

		// Regex to remove whitespaces and tab and new line
		String hasWhitespace = "This is a String with\t\ta tab and with a\nnew line";
		System.out.println(hasWhitespace);
		System.out.println(hasWhitespace.replaceAll("\\t", "X"));
		System.out.println(hasWhitespace.replaceAll("\\n", "X"));
		System.out.println(hasWhitespace.replaceAll("\\s", "X"));
		System.out.println(hasWhitespace.replaceAll(" ", "X"));
		System.out.println(hasWhitespace.replaceAll("\\S", "X"));
		System.out.println(hasWhitespace.replaceAll("\\b", "X"));

		// Pattern Matcher
		StringBuilder htmlText = new StringBuilder("<h1>This is a Heading</h1>");
		htmlText.append("<h2>Subheading</h2>");
		htmlText.append("<p>This is a paragraph with something.</p>");
		htmlText.append("<p>This is a paragraph with something else.</p>");
		htmlText.append("<h2>Summary</h2>");
		htmlText.append("<p>This is a paragraph with summary.</p>");
		System.out.println(htmlText);

		String h2Pattern = ".*<h1>.*";
		Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(htmlText);
		System.out.println(matcher.matches());

	}

}
