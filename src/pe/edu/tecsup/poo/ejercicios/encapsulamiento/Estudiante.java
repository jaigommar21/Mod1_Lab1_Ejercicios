package pe.edu.tecsup.poo.ejercicios.encapsulamiento;

public class Estudiante {

	public String apellidoPaterno;
	public String nombre;
	private int edad;

	public Estudiante(String nombre, String apellidoPaterno, int edad) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.edad = edad;
	}

	// METODOS :   [AMBITO] [TIPO_DE_DATO_DEVUELVE] [NOMBRE_DEL_METODO] () {
    //              
	//              }
	
	// AMBITO  :  public /  private
	
	
	// Obtener el valor del atributo edad
	public int obtenerEdad () {
		
		// para devolver algo en un metodo se emplea 
		// una palabra reservada que es   return
		
		return this.edad;
	}
	
	
	
}
