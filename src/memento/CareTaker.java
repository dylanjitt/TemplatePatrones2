package memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
	private Map<String,Memento> stateDocMap = new HashMap<>();
	
	public void createState(String ver, Memento memento) {
		stateDocMap.put(ver, memento);
	}
	
	public Memento getState(String ver) {
		return stateDocMap.get(ver);
	}

}
