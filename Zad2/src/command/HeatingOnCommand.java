package command;

public class HeatingOnCommand implements Command {

	private Heating heating;
	
	public HeatingOnCommand(Heating heating) {
		this.heating = heating;
	}
	
	
	@Override
	public void execute() {
		this.heating.switchOn();
		
	}

}
