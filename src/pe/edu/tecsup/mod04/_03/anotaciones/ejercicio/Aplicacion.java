package pe.edu.tecsup.mod04._03.anotaciones.ejercicio;

import java.lang.reflect.Method;

public class Aplicacion {

    public static void main(String[] args) {

        usingAnnotation();
       
    }

    @Curso(nombre = "Programacion", creditos = 24, numeroHoras = 5 )  
    public static void usingAnnotation() {

        try {
            
            Method method 
                = (new Aplicacion()).getClass().getMethod("usingAnnotation");
         
            Curso curso =  method.getAnnotation(Curso.class);
    
            System.out.println(curso.nombre());
            System.out.println(curso.creditos());
            System.out.println(curso.numeroHoras());
            
        } catch (NoSuchMethodException e) {
            System.out.println("Metodo no encontrado");
        }
    }
}
