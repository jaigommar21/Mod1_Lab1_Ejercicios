package pe.edu.tecsup.exceptions.personalizado;

public class SinFondosExcepion extends Exception{

	private static final long serialVersionUID = 1L;

	public SinFondosExcepion() {
		super();
	}

	/**
	 * Constructor
	 * @param mensaje
	 */
	public SinFondosExcepion(String mensaje) {
		// Llamando al Constructor de la clase base. 
		super("No hay fondos suficientes: " + mensaje);
	}
	


}
