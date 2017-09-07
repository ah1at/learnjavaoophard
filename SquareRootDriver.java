import java.util.Scanner;
import static java.lang.System.*;

public class SquareRootDriver {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(in);
		double n;
		SquareRootFinder sqrt = new SquareRootFinder();

		do {

			out.print("Enter a number (0 or negative to quit): ");
			n = keyboard.nextDouble();

			if (n > 0) {
				sqrt.setNumber(n);
				out.println(sqrt.getRoot());
			}

		} while (n > 0);

		out.println(sqrt.n);

		sqrt.n = 44;

		out.println(sqrt.n);
	}
}