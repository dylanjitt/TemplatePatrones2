package state;

import java.util.ArrayList;
import java.util.List;


public class Computadora {
	private int ramConsume;
	private int cpuConsume;
	private List<String> programsRunning = new ArrayList<>();
	
	private IcomputerState status;

	public Computadora() {}
	
	public IcomputerState getStatus() {
		return status;
	}

	public void setStatus(IcomputerState status) {
		this.status = status;
		useComputer();
	}
	
	public void useComputer() {
		status.compustate(this);
	}

	public int getRamConsume() {
		return ramConsume;
	}

	public void setRamConsume(int ramConsume) {
		this.ramConsume = ramConsume;
	}

	public int getCpuConsume() {
		return cpuConsume;
	}

	public void setCpuConsume(int cpuConsume) {
		this.cpuConsume = cpuConsume;
	}

	public List<String> getProgramsRunning() {
		return programsRunning;
	}

	public void setProgramsRunning(List<String> programsRunning) {
		this.programsRunning = programsRunning;
	}
	
	public void executeProgram(String exe) {
		programsRunning.add(exe);
		ramConsume+=5;
		cpuConsume+=5;
	}
	
	public void shutdown() {
		System.out.println("Closing programs");
		for (String exe:programsRunning) {
			System.out.println("< "+exe);
			ramConsume-=5;
			cpuConsume-=5;
		}
		programsRunning.clear();
		info();
	}
	
	public void info() {
		System.out.println("CONSUMO RAM: "+ramConsume+"%");
		System.out.println("CONSUMO CPU: "+cpuConsume+"%");
		if (programsRunning.isEmpty()) {
			System.out.println("No programs running");
		}else {
			System.out.println("Programas running:");
			programsRunning.forEach((s)-> System.out.println("> "+s));
		}
		
	}
	
	

}
