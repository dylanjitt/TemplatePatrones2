package state;

public class On implements IcomputerState{

	@Override
	public void compustate(Computadora computadora) {
		
		computadora.executeProgram("Fortnite");
		computadora.executeProgram("Apex Legends");
		computadora.executeProgram("Whatsapp");
		computadora.executeProgram("eclipse IDE");
		System.out.println("------------------------------------------");
		System.out.println("PC ON");
		System.out.println(" ");
		computadora.info();
		
	}

}
