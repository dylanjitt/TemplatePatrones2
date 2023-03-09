package mediator;

public class Equipo extends Jugador {

	public Equipo(String alias, String nombre, int ranking, IcanalCommunication cancalcomm) {
		super(alias, nombre, ranking, cancalcomm);
		super.setTeam("Equipo");
	}

	@Override
	public void send(String msg) {
		this.cancalcomm.send(msg, this);
		
	}

	@Override
	public void received(String msg) {
		this.info();
		System.out.println("INFO > Recieved: "+msg+"\n");
		
	}
	
	

}
