import static java.lang.System.*;

public class TVActorDriver {
	public static void main(String[] args) {

		TVActor a = new TVActor(),
				b = new TVActor(),
				c = new TVActor();

		a.name = "Thomas Middleditch";
		a.role = "Richard Hendricks";

		b.name = "Martin Starr";
		b.role = "Bertram Gilfoyle";

		c.name = "Kumail Nanjiani";
		c.role = "Dinesh Chugtai";

		a.age = 20;
		b.age = 30;
		c.age = 40;

		out.println(a.name + " played " + a.role + " at age " + a.age);
		out.println(b.name + " played " + b.role + " at age " + b.age);
		out.println(c.name + " played " + c.role + " at age " + c.age);

	}
}