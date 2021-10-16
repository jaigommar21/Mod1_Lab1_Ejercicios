package pe.edu.tecsup.poo.ejercicios.encapsulamiento;

public class Estudiante {

	private String apellidoPaterno;
	private String nombre;
	private int edad;
	private String sexo;

	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, String apellidoPaterno, int edad) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.edad = edad;
	}

	public Estudiante(String apellidoPaterno, String nombre, int edad, String sexo) {
		//super();
		this.apellidoPaterno = apellidoPaterno;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	
	// GET : Solo lectura
	
	
	// METODOS :   [AMBITO] [TIPO_DE_DATO_DEVUELVE] [NOMBRE_DEL_METODO] () {
    //              
	//              }
	
	// AMBITO  :  public /  private
	
	
	// Obtener el valor del atributo edad
	public int getEdad () {    // obtener --> get
		
		// para devolver algo en un metodo se emplea 
		// una palabra reservada que es   return
		
		return this.edad;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	 

	
}
