package alumnos;

public class arreglo {
	private String nombre;
	private String apellidos;
	private String sexo;
	private int edad;

	public arreglo(String nombre, String apellidos, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		String cadena = "Alumno: %s %s, Edad: %d, Sexo: %s";
		return cadena.formatted(nombre, apellidos, edad, sexo);
	}
	

}
