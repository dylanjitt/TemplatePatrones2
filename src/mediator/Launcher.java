package mediator;

public class Launcher {

	public static void main(String[] args) {
		Chat chat = new Chat();
		Jugador j1 = new Equipo("A", "loa", 3, chat);
		Jugador j2 = new Equipo("B", "lalo", 3, chat);
		Jugador j3 = new Rivales("C", "Anda", 3, chat);
		j1.setGeneralChat(true);
		j2.setGeneralChat(false);
		j3.setGeneralChat(true);
		
		chat.addToChat(j1).addToChat(j2).addToChat(j3);
		
		j1.send("Hola");

	}

}
