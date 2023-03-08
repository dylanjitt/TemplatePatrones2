package observer;

import java.util.ArrayList;
import java.util.List;

public class Post implements Inotify{
	private String type;
	private List<Usuario> userList = new ArrayList<>();
	private String notif;
	public Post(String type, String notif) {
		this.type = type;
		this.notif = notif;
	}
	@Override
	public void subscription(Usuario user) {
		userList.add(user);
		
	}
	@Override
	public void notifyy() {
		System.out.println("*****************************");
		if (type=="video") {
			System.out.println("se ha subido nuevo contendio: "+type);
			for (Usuario u:userList) {
				if (u.isWantvideo()) {
					u.update(notif);
				}
			}	
		}else {
			System.out.println("se ha subido nuevo contendio: "+type);
			for (Usuario u:userList) {
				
					u.update(notif);
				
			}
		}
		
		
	}
	
	
	
	

}
