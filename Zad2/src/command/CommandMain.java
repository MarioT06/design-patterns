package command;

public class CommandMain {
	
	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();
		Heating heating = new Heating();
		Command heatingOnCommand = new HeatingOnCommand(heating);
		Command heatingOffCommand = new HeatingOffCommand(heating);
		
		remoteController.setCommand(heatingOnCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(heatingOffCommand);
		remoteController.pressButton();

	}


}
