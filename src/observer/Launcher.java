package observer;

public class Launcher {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Sara", false);
		Usuario u2 = new Usuario("Martina", true);
		Usuario u3 = new Usuario("Andrea", false);
		Usuario u4 = new Usuario("Martin", true);
		Usuario u5 = new Usuario("Diego", false);
		
		Post post = new Post("Video", "Se ha subido un nuevo video!, BIOLOGIA MARINA");
		Post post2 = new Post("Foto", "Nueva foto del mar");
		post.subscription(u1);
		post.subscription(u2);
		post.subscription(u3);
		post.subscription(u4);
		post.subscription(u5);
		
		post2.subscription(u1);
		post2.subscription(u2);
		post2.subscription(u3);
		post2.subscription(u4);
		post2.subscription(u5);
		
		post.notifyy();
		post2.notifyy();
		

	}

}
