package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		ArrayList<Curso> listaCursos = new ArrayList<Curso>();
		
		int opcionMenu = 0;
		
		mostrarMenu();
		
		while (opcionMenu != 12) {
			
			System.out.println("Elija una opcion: ");
			opcionMenu = Integer.parseInt(sc.nextLine());
			
			switch (opcionMenu) {
			
				case 1:
					
					crearNuevoAlumno(listaAlumnos,listaCursos,sc);
					
					break;
					
				case 2:
					
					crearNuevoCurso(listaCursos,sc);
					
					break;
					
				case 3:
					
					editarAlumno(listaAlumnos,sc);
					
					break;
					
				case 4:
					
					editarCurso(listaCursos,sc);
					
					break;
					
				case 5:
					
					eliminarAlumno(listaAlumnos,sc);
					
					break;
					
				case 6:
					
					eliminarCurso(listaCursos,sc);
					
					break;
					
				case 7:
					
					agregarCursoAAlumno(listaAlumnos,sc);
					
					break;
					
				case 8:
					
					eliminarCursoAAlumno(listaAlumnos,sc);
					
					break;
					
				case 9:
					
					mostrarAlumnoEspecifico(listaAlumnos,sc);
					
					break;
					
				case 10:
					
					mostrarCursoEspecifico(listaCursos,sc);
					
					break;
					
				case 11:
					
					mostrarCursosAlumnos(listaCursos,listaAlumnos);
					
					break;
					
				default:
					
					if (opcionMenu != 12) {
						
						System.out.println("Opcion no valida, vuelva a intentarlo.");
						
					} else {
						
						System.out.println("--------- | FIN | ---------");
						
					}
			
			}
			
		}

	}

	private static void crearNuevoAlumno(ArrayList<Alumno> listaAlumnos, ArrayList<Curso> listaCursos, Scanner sc) {
		// TODO Auto-generated method stub
		
		if (listaCursos.size() < 1) {
			
			System.out.println("No hay cursos creados, crea primero uno.");
			
		} else {
			
			Alumno newAlumno = new Alumno();
			
			String nombreAlumno = "";
			int edadAlumno = 0;
			String[] cursosAlumno = new String[0];
			
			System.out.println("Escriba el nombre del alumno: ");
			nombreAlumno = sc.nextLine();
			
			if (comprobarAlumno(listaAlumnos,nombreAlumno)) {
				
				System.out.println("El alumno indicado ya existe.");
				
			} else {
				
				System.out.println("Indique la edad del alumno: ");
				edadAlumno = Integer.parseInt(sc.nextLine());
				
				String curso = "";
				
				for (int i = 0;curso.equals(" ");i++) {
					
					System.out.println("Escriba el curso a añadir (Pulsa enter para dejar de añadir cursos): ");
					curso = sc.nextLine();
					
					if (curso.equals(" ")) {
						
						break;
						
					} else {
						
						cursosAlumno[i] = curso;
						
					}
					
				}
				
			}
			
			
		}
		
	}

	private static void crearNuevoCurso(ArrayList<Curso> listaCursos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void editarAlumno(ArrayList<Alumno> listaAlumnos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void editarCurso(ArrayList<Curso> listaCursos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarAlumno(ArrayList<Alumno> listaAlumnos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarCurso(ArrayList<Curso> listaCursos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	private static void agregarCursoAAlumno(ArrayList<Alumno> listaAlumnos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarCursoAAlumno(ArrayList<Alumno> listaAlumnos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarAlumnoEspecifico(ArrayList<Alumno> listaAlumnos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarCursoEspecifico(ArrayList<Curso> listaCursos, Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	private static void mostrarCursosAlumnos(ArrayList<Curso> listaCursos, ArrayList<Alumno> listaAlumnos) {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarMenu() {
		// TODO Auto-generated method stub
		
		System.out.println("--------- | GESTION COLEGIO | ---------\n");
		System.out.println("1. Crear nuevo alumno");
		System.out.println("2. Crear nuevo curso");
		System.out.println("3. Editar alumno existente");
		System.out.println("4. Editar curso existente");
		System.out.println("5. Eliminar alumno");
		System.out.println("6. Eliminar curso");
		System.out.println("7. Añadir un curso a un alumno");
		System.out.println("8. Eliminar un curso a un alumno");
		System.out.println("9. Mostrar informacion de un alumno");
		System.out.println("10. Mostrar informacion de un curso");
		System.out.println("11. Mostrar informacion de los alumnos y los cursos");
		System.out.println("12. SALIR");
		System.out.println("\n--------- | GESTION COLEGIO | ---------\n");
		
	}
	
	private static boolean comprobarAlumno (ArrayList<Alumno> listaAlumnos, String alumno) {
		
		boolean existe = false;
		
		for (int i = 0;i < listaAlumnos.size();i++) {
			
			if (listaAlumnos.get(i).getNombre().equalsIgnoreCase(alumno)) {
				
				existe = true;
				
			}
			
		}
		
		return existe;
		
	}

}
