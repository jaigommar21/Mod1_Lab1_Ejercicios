package pe.edu.tecsup.tarea;

public class Empresa {

	Cargo cargos[];  // los cargos se almacenaran en una arreglo
	Pais pais;
	String nombre;
	int codigo;
	
	public Empresa(int nroCargos, Pais pais, String nombre, int codigo) {
		super();
		this.cargos = new Cargo[nroCargos]; // se define los numeros de cargos
		this.pais = pais;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	/**
	 * Agrega un cargo
	 * @param pos
	 * @param cargo
	 */
	public void agregarCargo(int pos, Cargo cargo) {
		
		this.cargos[pos] = cargo;
	}

	public void informacion() {
		// TODO Auto-generated method stub
		System.out.println("Debera imprimir informacion de la empresa");
	}
	
	
	
	
}
