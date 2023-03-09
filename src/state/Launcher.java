package state;

public class Launcher {

	public static void main(String[] args) {
		Computadora pc = new Computadora();
		
		pc.setStatus(new Off());
		pc.setStatus(new On());
		pc.setStatus(new Restart());
		//pc.useComputer();

	}

}
