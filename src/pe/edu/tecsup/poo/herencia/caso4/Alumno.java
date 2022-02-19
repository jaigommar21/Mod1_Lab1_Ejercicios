package pe.edu.tecsup.poo.herencia.caso4;

public class Alumno {

	protected String nombre;
	protected int edad;
	protected String dni;

	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimirDatos() {
		
		System.out.println("Nombre -> " +  this.nombre);
		System.out.println("Edad -> " +  this.edad);
		
	}
	
}
