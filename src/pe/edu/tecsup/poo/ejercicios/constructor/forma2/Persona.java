package pe.edu.tecsup.poo.ejercicios.constructor.forma2;

public class Persona {
    // atributos
	public String nombre;
    public int diaNacimiento;
    public String dni;

    /**
     * Es lo primero que se ejecuta al instanciar una clase
     */
    //public Persona(String nombre /* Aca se definen los parametros o argumentos */ ) {    	
    public Persona(String pNombre, int pDiaNacimiento, String pDni  ) {    	
    	this.nombre=pNombre;
    	this.diaNacimiento=pDiaNacimiento;
    	this.dni=pDni;
    	System.out.println("----------------------");
    	System.out.println("Instanciando un objeto");
    }
    
    /**
     * Constructor que inicializa todos los atributos de la clase
     * @param nombre
     * @param edad
     * @param dni
     */
//    public Persona(String nombre, int edad, String dni) {
//    	this.nombre= nombre;
//    	this.diaNacimiento=edad;
//    	this.dni=dni;
//    }
    
  
    
}
