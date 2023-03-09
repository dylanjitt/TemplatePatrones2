package mediator;

public abstract class Jugador {
	private String alias;
	private String nombre;
	private int ranking;
	private String team;
	private boolean generalChat;
	
	public boolean isGeneralChat() {
		return generalChat;
	}

	public void setGeneralChat(boolean generalChat) {
		this.generalChat = generalChat;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	protected IcanalCommunication cancalcomm;

	public Jugador(String alias, String nombre, int ranking, IcanalCommunication cancalcomm) {
		this.alias = alias;
		this.nombre = nombre;
		this.ranking = ranking;
		this.cancalcomm = cancalcomm;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public void info() {
		System.out.println(alias+" ("+nombre+") Rank: "+ranking+" Team:"+team);
	}
	
	public abstract void send(String msg);
    public abstract void received(String msg);
	
	

}
