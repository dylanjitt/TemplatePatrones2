package observer;

public class Usuario implements Iuser{
	
	private String name;
	private boolean wantvideo;

	public Usuario(String name, boolean wantvideo) {
		super();
		this.name = name;
		this.wantvideo = wantvideo;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isWantvideo() {
		return wantvideo;
	}



	public void setWantvideo(boolean wantvideo) {
		this.wantvideo = wantvideo;
	}



	@Override
	public void update(String notification) {
		System.out.println("------------------------");
		System.out.println("Usuario: "+name+", Tienes una notificación");
		System.out.println(notification);
		
	}

}
