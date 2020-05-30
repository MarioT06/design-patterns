package decorator;

public abstract class BurgerDecorator {
	
	protected Burger decoratedBurger;
	
	public BurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
		
	}
	public void create() {
		// Add functionality to the basic car class
		this.decoratedBurger.create();
	}
}

