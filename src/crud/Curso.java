package crud;

import java.util.ArrayList;

public class Curso {
	
	private String titulo;
	private String descripcion;
	private String profesor;
	private ArrayList<Alumno> alumnos;
	
	// CONSTRUCTORES
	
	public Curso () {
		
		this.alumnos = new ArrayList<Alumno>();
		
	}
	
	public Curso(String titulo, String descripcion, String profesor) {
		
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.profesor = profesor;
		this.alumnos = new ArrayList<Alumno>();
		
	}
	
	// GETTERS Y SETTERS

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	// METODOS
	
	public void anyadirAlumno (Alumno alumno) {
		
		this.alumnos.add(alumno);
		
	}
	
	public boolean eliminarAlumno (Alumno alumno) {
		
		/* for (int i = 0;i < this.alumnos.size();i++) {
			
			if (this.alumnos.get(i).equals(alumno)) {
				
				this.alumnos.remove(i);
				
			}
			
		} */
		
		return this.alumnos.remove(alumno); // Elimina la primera ocurrencia de dicho objeto en el arraylist
		
	}
	
	// toString
	
	@Override
	public String toString() {
		
		String nomAlumnos = "";
		
		for (int i = 0;i < alumnos.size();i++) {
			
			if (i == alumnos.size() - 1) {
				
				nomAlumnos += alumnos.get(i).getNombre();
				
			} else {
				
				nomAlumnos += alumnos.get(i).getNombre() + ", ";
				
			}
			
		}
		
		return "-------------------------\n\n Titulo: " + titulo + "\n Descripcion: " + descripcion + "\n Profesor: " + profesor + "\n Alumnos: " + nomAlumnos + "\n\n-------------------------\n";
		
		
	}
	
}
