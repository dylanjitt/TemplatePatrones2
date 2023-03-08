package memento;

public class Document {
	private String title;
	private String contnent;
	public Document(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContnent() {
		return contnent;
	}
	public void setContnent(String contnent) {
		this.contnent = contnent;
	}
	
	public void info() {
		System.out.println("TITULO DOCUMENTO:"+title+":");
		System.out.println("-"+contnent);
		System.out.println("--------------------------------");
		
	}
	

}
