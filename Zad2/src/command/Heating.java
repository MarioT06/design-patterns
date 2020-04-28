package command;

public class Heating {
	
	private Boolean heatingOn;
	
	public void switchOn() {
		System.out.println("Heating is on.");
		this.heatingOn = true;
	}

	public void switchOff() {
		System.out.println("Heating is off.");
		this.heatingOn = false;
	}
}
