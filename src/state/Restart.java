package state;

public class Restart implements IcomputerState{

	@Override
	public void compustate(Computadora computadora) {
		System.out.println("------------------------------------------");
		System.out.println("PC RESTARTING");
		System.out.println("-Consumo actual RAM: "+computadora.getRamConsume()+"%");
		System.out.println("-Consumo actual CPU: "+computadora.getCpuConsume()+"%");
		computadora.shutdown();
		
	}

}
