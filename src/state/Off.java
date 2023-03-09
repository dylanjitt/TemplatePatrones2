package state;

public class Off implements IcomputerState{

	@Override
	public void compustate(Computadora computadora) {
		System.out.println("------------------------------------------");
		System.out.println("PC OFF");
		computadora.setCpuConsume(0);
		computadora.setRamConsume(0);
		computadora.info();
		
	}
	

}
