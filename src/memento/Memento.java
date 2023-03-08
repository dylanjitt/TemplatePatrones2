package memento;

public class Memento {
	private Document doc;
	
	public Memento(Document doc) {
		this.doc = doc;
	}
	
	public Document getDocState() {
		return doc;
	}

}
