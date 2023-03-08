package memento;

public class Launcher {

	public static void main(String[] args) {
		Document doc = new Document("Tesis ChatGPT");
		Interactor inte= new Interactor(doc);
		
		inte.saveDocument("este documento es una prueba");
		inte.saveDocument("el exito solo depende de tu esfuerzo");
		inte.saveDocument("prologo");
		inte.saveDocument("este documento fue actualizado satisfactoriamente");
		
		inte.recoverDoc("version1");

	}

}
