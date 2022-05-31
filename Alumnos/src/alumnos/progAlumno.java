package alumnos;

import java.util.Scanner;

public class progAlumno {

	private Scanner scn = new Scanner(System.in).useDelimiter("\n");
	
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("****  INFORMACION DE ALUMNOS  ****");
		System.out.println("**********************************");
		
		progAlumno prog = new progAlumno();
		arreglo[] arre = prog.creararreglo();
		prog.imparreglo(arre);
		
	}

	private void imparreglo(arreglo[] arre) {
		System.out.println("\n**** ALUMNOS INGRESADOS *********");
		for (int i=0; i<arre.length; i++) {
			System.out.printf("Alumno %d en la posicion %d del arreglo\n", i+1, i);
			System.out.println(arre[i]);
		}
		
	}

	private arreglo[] creararreglo() {
		System.out.print("Cuantos alumnos va a ingresar?: ");
		int cantidad = scn.nextInt();
		arreglo[] arre = new arreglo[cantidad];
		for (int i=0; i< cantidad; i++) {
			arre[i]= ingresaAlumno();	
		}
		return arre;
	}

	private arreglo ingresaAlumno() {
		System.out.println("\nDATOS DEL ALUMNO");
		System.out.println("----------------");
		System.out.print("Ingrese el Nombre: ");
		String nombres = scn.next();
		System.out.print("Ingrese el Apellido: ");
		String apellidos = scn.next();
		System.out.print("Ingrese la Edad: ");
		int edad = scn.nextInt();
		System.out.print("Ingrese el Sexo: ");
		String sexo = scn.next();
		return new arreglo(nombres, apellidos, edad, sexo);
	}

}
