package decorator;

public class ClassicBurger implements Burger {

	@Override
	public void create() {
		System.out.println("Creating classic burger");
	}

}
