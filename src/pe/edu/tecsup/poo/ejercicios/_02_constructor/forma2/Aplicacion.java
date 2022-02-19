package pe.edu.tecsup.poo.ejercicios._02_constructor.forma2;

public class Aplicacion {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	
    	Persona objetoPersona1=new Persona("Maria",12,"111111X");
    	System.out.println(objetoPersona1.nombre);
    	System.out.println(objetoPersona1.diaNacimiento);
    	System.out.println(objetoPersona1.dni);
    	
    	Persona objetoPersona2=new Persona("Jose",30,"2222222Y");
    	System.out.println(objetoPersona2.nombre);
    	System.out.println(objetoPersona2.diaNacimiento);
    	System.out.println(objetoPersona2.dni);
    	
        //Persona objPersona=new Persona("Cristina",1,"12345678"); // llama al constructor
        
        //objPersona.nombre="Jaime";
        //objPersona.diaNacimiento=21;
        //objPersona.dni="9999999";
        
//        System.out.println("Mi nombre es: "+ objPersona.nombre+
//                "\nEl dia de nacimiento es: "+ objPersona.diaNacimiento+
//                "\nEl DNI es: "+ objPersona.dni);
        
        
    }
}
