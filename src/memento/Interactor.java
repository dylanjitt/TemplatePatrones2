package memento;


public class Interactor {
	private String ver;
	private int nver=0;
	private Originator originator = new Originator();
	private CareTaker caretaker = new CareTaker();
	
	private Document doc;
	
	public Interactor(Document doc) {
		this.doc = doc;
	}

	public void saveDocument(String content) {
		String[] words = content.split(" ");
		int qwords = words.length;
		if (qwords >=5) {
			doc.setContnent(content);
			nver++;
			ver = "version"+nver;
			originator.setDoc(doc);
			caretaker.createState(ver, originator.createMemento());
			System.out.println(">    Archivo Guardado");
			doc.info();
		}
		
		
	}
	
	public void recoverDoc(String ver) {
		System.out.println(">    Restaurando archivo");
		doc = originator.returnOldState(caretaker.getState(ver));
		doc.info();
	}

}
