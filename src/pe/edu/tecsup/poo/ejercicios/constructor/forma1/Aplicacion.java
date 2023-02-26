package pe.edu.tecsup.poo.ejercicios.constructor.forma1;

public class Aplicacion {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	
    	Persona objPersona=new Persona();
    	
        //Persona objPersona=new Persona("Cristina",1,"12345678"); // llama al constructor
        
        //objPersona.nombre="Jaime";
        //objPersona.diaNacimiento=21;
        //objPersona.dni="9999999";
        
        System.out.println("Mi nombre es: "+ objPersona.nombre+
                "\nEl dia de nacimiento es: "+ objPersona.diaNacimiento+
                "\nEl DNI es: "+ objPersona.dni);
        
        
    }
}
