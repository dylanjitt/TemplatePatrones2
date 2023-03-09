package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IcanalCommunication{
	
	private List<Jugador> general = new ArrayList<>();
	
	public Chat addToChat(Jugador g) {
		general.add(g);
		return this;
	}

	@Override
	public void send(String mensaje, Jugador jugador) {
		for (Jugador gamer: general) {
			if (!jugador.getNombre().equals(gamer.getNombre())) {
				if (jugador.isGeneralChat()==false) {
					if (jugador.getTeam().equals("Equipo")&&gamer.getTeam().equals("Equipo")) {
						gamer.received(mensaje);
					}else if (jugador.getTeam().equals("Rivales")&&gamer.getTeam().equals("Rivales")) {
						gamer.received(mensaje);
					}
				}else {
					gamer.received(mensaje);
				}
			}
		}
		
	}

}
