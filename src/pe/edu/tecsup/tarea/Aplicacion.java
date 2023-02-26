package pe.edu.tecsup.tarea;

public class Aplicacion {

	public static void main(String[] args) {

		// Crea empleado1
		Empleado empleado1 = new Empleado();
		
		// Crea cargo1 para el empleado1 , no tiene subordinado
		Cargo cargo1 = new Cargo(null, 0, null, empleado1);
		
		// Crea empresa con 2 cargos , los cargos estan pendiente de asignar
		// 
		Empresa empresa = new Empresa(2, null, null, 0);
		
		// Asigna 1 cargo
		empresa.agregarCargo(0, cargo1); // El primer cargo esta en 
										 // la posicion 0 del arreglo
		
		// Imprime informacion de la empresa
		empresa.informacion();
	}

}
