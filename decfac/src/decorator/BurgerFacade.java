package decorator;

public class BurgerFacade {
	
	private Burger classic;
	private Burger classiccheese;
	private Burger classicegg;
	
	public BurgerFacade() {
		this.classic = new ClassicBurger();
		this.classiccheese = new ClassicBurgerCheese();
		this.classicegg = new ClassicBurgerEgg();
								
	}
	public void CreateClassicBurger() {
		System.out.println("Just a classic burger");
		
		this.classic.create();
	}
	
public void CreateClassicBurgerCheese() {
		System.out.println("Put cheese on burger");
		
		this.classiccheese.create();
	}

public void CreateClassicBurgerEgg() {
		System.out.println("Put egg on burger");
	
	this.classicegg.create();
	}

}
