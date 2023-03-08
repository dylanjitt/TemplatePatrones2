package strategy;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	private List<Estudiantes> estudiantes = new ArrayList<>();
	private Iestudiantes sortType;
	public DataBase(List<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public List<Estudiantes> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(List<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public Iestudiantes getSortType() {
		return sortType;
	}
	public void setSortType(Iestudiantes sortType) {
		this.sortType = sortType;
	}
	
	public void addEstudiante(Estudiantes e) {
		estudiantes.add(e);
	}
	
	public void setSelection(Iestudiantes sortSelection) {
		this.sortType = sortSelection;
	}
	
	public void show() {
		sortType.sorting(estudiantes);
	}
	

}
