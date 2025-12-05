package crud;

import java.util.Arrays;

public class Alumno {
	
	private String nombre;
	private int edad;
	private String[] cursos;
	
	// CONSTRUCTORES
	
	public Alumno () {
		
	}
	
	public Alumno(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.cursos = new String[0];
		
	}
	
	// GETTER Y SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String[] getCursos() {
		return cursos;
	}
	
	// METODOS

	public void anyadirCurso (String curso) {
		
		String[] nuevoArray = Arrays.copyOf(cursos, cursos.length + 1);
		
		/* for (int i = 0;i < cursos.length;i++) {
			
			nuevoArray[i] = cursos[i];
			
		} */
		
		nuevoArray[cursos.length] = curso;
		
		
		
		this.cursos = nuevoArray;
		
	}
	
	public void eliminarCurso (String curso) {
		
		String[] nuevoArray = new String[cursos.length - 1];
		
		int index = 0;
		
		for (int i = 0;i < cursos.length;i++) {
			
			if (cursos[i].equals(curso)) {
				
				continue; // Es como el break pero en vez de salir del bucle vuelve al principio y se repite
				
			}
			
			if (index < nuevoArray.length) {
				
				nuevoArray[index] = cursos[i];
				index++;
				
			}
			
		}
		
		this.cursos = nuevoArray;
		
	}
}
