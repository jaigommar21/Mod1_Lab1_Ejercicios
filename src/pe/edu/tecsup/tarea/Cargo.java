package pe.edu.tecsup.tarea;

public class Cargo {

	String nombreCargo;
	float sueldo;
	String tipoCargo;
	Empleado empleado;
	Cargo subordinado;
	
	// Empleado con subordinados
	public Cargo(String nombreCargo, float sueldo, String tipoCargo, Empleado empleado, Cargo subordinado) {
		this.nombreCargo = nombreCargo;
		this.sueldo = sueldo;
		this.tipoCargo = tipoCargo;
		this.empleado = empleado;
		this.subordinado = subordinado;
	}
	
	// Empleado sin subordinados
	public Cargo(String nombreCargo, float sueldo, String tipoCargo, Empleado empleado) {
		this.nombreCargo = nombreCargo;
		this.sueldo = sueldo;
		this.tipoCargo = tipoCargo;
		this.empleado = empleado;
		this.subordinado = null;
	}
	
	
}
