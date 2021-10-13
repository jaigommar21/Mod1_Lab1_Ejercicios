package pe.edu.tecsup.poo.ejercicios.constructor.forma3;

public class Aplicacion {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	
    	Persona objetoPersona1=new Persona("Maria",12,"111111X");
    	System.out.println(objetoPersona1.nombre);
    	System.out.println(objetoPersona1.diaNacimiento);
    	System.out.println(objetoPersona1.dni);
    	System.out.println("--------------------");    	
    	
    	Persona objetoPersona2=new Persona("Jose",30,"2222222Y");
    	System.out.println(objetoPersona2.nombre);
    	System.out.println(objetoPersona2.diaNacimiento);
    	System.out.println(objetoPersona2.dni);
    	System.out.println("--------------------");
    	
    	Persona objetoPersona3=new Persona();
    	System.out.println(objetoPersona3.nombre);
    	System.out.println(objetoPersona3.diaNacimiento);
    	System.out.println(objetoPersona3.dni);
    	
        
    }
}
