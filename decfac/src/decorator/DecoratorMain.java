package decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		
		BurgerFacade burgerFacade = new BurgerFacade();
		
		burgerFacade.CreateClassicBurger();
		burgerFacade.CreateClassicBurgerCheese();
		burgerFacade.CreateClassicBurgerEgg();	

	}

}
