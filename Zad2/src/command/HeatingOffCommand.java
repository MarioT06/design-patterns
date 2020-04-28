package command;

public class HeatingOffCommand implements Command {

	private Heating heating;
	
	public HeatingOffCommand(Heating heating) {
		this.heating = heating;
	}
	
	@Override
	public void execute() {
		this.heating.switchOff();
		
	}

}
