import static java.lang.System.*;

class Cow {
  String name = "Cow";

  public void moo() {
    System.out.println(name + " says moo.");
  }
}

class Pig {
  public void oink() {
    System.out.println("Pig says oink.");
  }
}

public class OldMacDonald {
  public static void main (String[] args) {

    Cow maudine = new Cow(), pauline = new Cow();

    maudine.name = "Alphabet";

    maudine.moo();
    pauline.moo();

    Pig snowball = new Pig();

    snowball.oink();
    snowball.oink();

    Duck ferdinand = new Duck();

    ferdinand.quack();

    Pig piggy = new Pig();

    piggy.oink();
  }
}

// Still works
class Duck {
  public void quack() {
    System.out.println("Duck says quack.");
  }
}
