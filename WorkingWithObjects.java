import java.io.File;  // to create File objects
import java.util.ArrayList; // to create ArrayList objects
import java.util.Random; // etc
import java.util.Scanner;

import static java.lang.System.*; // So I don't have to type System. every time

public class WorkingWithObjects {
  public static void main(String[] args) throws Exception {

    // Create, instantiate File object. Parameter is String containing
    // name of file to connect itself to
    File f = new File("datafiles/phonetic-alphabet.txt");

    if (!f.exists()) {
      out.println(f.getName() + " not found in this folder. :(");
      exit(1);
    }

    // An ArrayList of strings
    ArrayList<String> words = new ArrayList<String>();

    // Scanner object, using a File as its parameter
    Scanner alpha = new Scanner(f);

    /* That’s pretty much how Java creates objects. The keyword new is always
    involved, and the name of the class (twice) and some parens. */

    out.print("Reading words from \"" + f.getPath() + "\"... ");

    while(alpha.hasNext()) {
      String w = alpha.next();
      words.add(w);
    }

    alpha.close();

    out.print("done.\n\n");

    Random rng = new Random();
    //rng.setSeed(12345);
    rng.setSeed(23213);

    for (int n = 0; n < 3; n++) {
      int i = rng.nextInt(words.size());
      String s = words.get(i);
      out.println(i + " " + s.toLowerCase());
    }

    out.println();
  }
}
