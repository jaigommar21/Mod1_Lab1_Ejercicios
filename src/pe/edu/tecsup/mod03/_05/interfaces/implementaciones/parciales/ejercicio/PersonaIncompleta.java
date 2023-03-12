package pe.edu.tecsup.mod03._05.interfaces.implementaciones.parciales.ejercicio;

/**
 *  Clase abstracta : no implementa todos los metodos de las interfaces
 * @author jgomez
 *
 */
public abstract class PersonaIncompleta 
    implements HabilidadCantar, HabilidadCorrer, HabilidadNadar{

	private String nombres;
	
	private String apellidos;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public void cantar() {
		System.out.println("Me llamo " + this.nombres + " y me encanta cantar...");
		
	}


}
