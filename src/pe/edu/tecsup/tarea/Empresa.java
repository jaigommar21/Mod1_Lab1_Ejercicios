package pe.edu.tecsup.tarea;

public class Empresa {

	Cargo trabajadores[]; 
	Pais pais;
	String nombre;
	int codigo;
	
	public Empresa(int nroTrabajadores, Pais pais, String nombre, int codigo) {
		super();
		this.trabajadores = new Cargo[nroTrabajadores]; // se define 2 trabajodres
		this.pais = pais;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	
	
}
