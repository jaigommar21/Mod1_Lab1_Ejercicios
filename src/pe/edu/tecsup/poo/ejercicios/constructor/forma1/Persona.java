package pe.edu.tecsup.poo.ejercicios.constructor.forma1;

public class Persona {
    // atributos
	public String nombre;
    public int diaNacimiento;
    public String dni;

    /**
     * Es lo primero que se ejecuta al instanciar una clase
     */
    public Persona() {    	
    	this.nombre="Roberto";
    	this.diaNacimiento=21;
    	this.dni="9999999";
    	System.out.println("----------------------");
    	System.out.println("Instanciando un objeto");
    }
    
    /**
     * Constructor que inicializa todos los atributos de la clase
     * @param nombre
     * @param edad
     * @param dni
     */
    public Persona(String nombre, int edad, String dni) {
    	this.nombre= nombre;
    	this.diaNacimiento=edad;
    	this.dni=dni;
    }
    
  
    
}
