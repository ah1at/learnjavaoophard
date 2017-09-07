import static java.lang.System.*;
import java.util.Scanner;

public class StringFunFunctions {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(in);

		out.print("Enter a message: ");
		
		String msg = keyboard.nextLine();

		out.println(camelCase(reverse(msg)));
	}

	public static String reverse(String s) {

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--)
			rev += s.substring(i, i+1);

		return rev;
	}

	public static String camelCase(String s) {

		String[] words = s.toLowerCase().split(" ");
		String result = "";

		for (String w: words)
			result += w.substring(0,1).toUpperCase() + w.substring(1);

		return result;
	}
}