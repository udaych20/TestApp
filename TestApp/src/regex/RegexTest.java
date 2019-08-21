package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		String[] split = Pattern.compile("(\\|)").split("This|is|uday|Kumar|null");
		System.out.println(Arrays.toString(split));

	}
}
