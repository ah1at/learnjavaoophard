public class StringFunObject {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String s) {
		message = s;
	}

	public void reverse() {

		String rev = "";

		for (int i = message.length() - 1; i >= 0; i--)
			rev += message.substring(i, i+1);

		message = rev;
	}

	public void solomon() {
		message = message.substring(0, message.length()/2);
	}

	public void camelCase() {

		String[] words = message.toLowerCase().split(" ");
		String result = "";

		for (String w: words)
			result += w.substring(0,1).toUpperCase() + w.substring(1);

		message = result;
	}
}