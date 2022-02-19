package pe.edu.tecsup.poo.ejercicios._02_constructor.forma3;

public class Persona {
    // atributos
	public String nombre;
    public int diaNacimiento;
    public String dni;

    /**
     * Es lo primero que se ejecuta al instanciar una clase
     */
    public Persona() {    	
    	this.nombre="NOMBRE_X_DEFECTO";
    	this.diaNacimiento=0;
    	this.dni="SIN_DNI";
    }
    
    /**
     * Constructor que inicializa todos los atributos de la clase
     * @param nombre
     * @param edad
     * @param dni
     */
    //public Persona(String nombre /* Aca se definen los parametros o argumentos */ ) {    	
    public Persona(String nombre, int edad, String dni) {
    	this.nombre= nombre;
    	this.diaNacimiento=edad;
    	this.dni=dni;
    }
    
  
    
}
