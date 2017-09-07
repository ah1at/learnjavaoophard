import static java.lang.System.*;

public class OldMacDriver {
  public static void main (String[] args) {

    OldMacCow maudine = new OldMacCow(), pauline = new OldMacCow();

    maudine.name = "Alphabet";

    maudine.moo();
    pauline.moo();

    OldMacPig snowball = new OldMacPig();

    snowball.oink();
    snowball.oink();

    OldMacDuck ferdinand = new OldMacDuck();

    ferdinand.quack();

    OldMacPig piggy = new OldMacPig();

    piggy.oink();
  }
}

// it all worked out