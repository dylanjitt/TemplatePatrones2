package memento;

public class Originator {
	private Document doc;
	
	public void setDoc(Document doc) {
		this.doc=new Document(doc.getTitle());
		this.doc.setContnent(doc.getContnent());
	}
	
	public Memento createMemento() {
		return new Memento(doc);
	}
	
	public Document returnOldState(Memento memento) {
		this.doc = memento.getDocState();
		return this.doc;
	}

}
