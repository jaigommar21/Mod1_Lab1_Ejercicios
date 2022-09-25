package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio05_For {

	  public static void main(String[] args) {
		  
	        for(int i = 20; i >= 5; i-=2) {
	      
	        	if(i % 3 != 0) {  // % obtiene residuo de la division
	            
	        		if(i % 4 == 0) {  //  == equivalencia
	                    System.out.println(i + " soy multiplo de 4 ");
	                } else {
	                    System.out.println(i);
	                }
	            }
	        }
	    }
	
}
