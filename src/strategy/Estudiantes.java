package strategy;

public class Estudiantes {
	private int ci;
	private String nombre;
	private String carrera;
	public Estudiantes(int ci, String nombre, String carrera) {
		this.ci = ci;
		this.nombre = nombre;
		this.carrera = carrera;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public void info() {
		System.out.println("Nombre: "+nombre);
		System.out.println("C.I.: "+ci);
		System.out.println("Carrera: "+carrera);
	}
	
	

}
