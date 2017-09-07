import static java.lang.System.*;
import java.util.Scanner;

public class StringFunOODriver {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(in);
		StringFunObject sfo = new StringFunObject();

		out.print("Enter a message: ");
		
		sfo.setMessage(keyboard.nextLine());

		sfo.solomon();

		// sfo.reverse();
		// sfo.camelCase();

		// out.println(sfo.getMessage());
		out.println(sfo.message);


	}
}