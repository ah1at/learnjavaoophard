public class Rectangle {
	private int, length, width;
	// private means they can't be accesed directly outside of this class

	public Rectangle() { length = width = 0; };
	// This is a constructor

	// This is also a constructor. Can be used like:
	// Rectangle tangul = new Rectangle (10, 5);
	public Rectangle(int l, int w) {
		length = l;
		width = w; 
	}

	// it's acceptable to write one-line functions like this, usually for get...
	public int getArea() { return length * width };
}