package pe.edu.tecsup._04_util.string;

public class TestApp {

	public static void main(String[] args) {
		                  
		String cadena = "  Bienvenido a la clase de Java Basico en Tecsup ";
		
		String cadena3 = cadena + "al evento...";
		
		System.out.println( cadena.length() );
		System.out.println( cadena.toLowerCase() );
		System.out.println( cadena.toUpperCase() );
		System.out.println( cadena.trim() );
		System.out.println( cadena.replaceAll("Tecsup", "Utec") );
		System.out.println( cadena.substring(12, 23) );
		System.out.println( cadena.indexOf("Java") );
		
		int position = cadena.indexOf("Java");
		System.out.println( cadena.substring(position, position + 11) );
		
		String texto = "Juan";
		if(texto.isEmpty()) {
			System.err.println("Debe de completar el texto");
		} else {
			System.out.println("Todo OK!");
		}
		
		if(cadena.trim().startsWith("Bienvenido")) {
			System.out.println("Es correcto");
		}
		
		String[] partes = cadena.split(" ");
		for (int i = 0; i < partes.length; i++) {
			System.out.println("Parte " + i + ": " + partes[i]);
		}

		if(cadena.equals(texto)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
		
		String cadena2 = "  Bienvenido a la clase de Java Basico en Tecsup ";
		
		if(cadena == cadena2) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
		
		String s = cadena.trim().replaceAll("Tecsup", "Utec").substring(4).toLowerCase().toString();
		System.out.println(s);
		
	}
	
	/*
	 
	  
		String cadena2 = "Hoy es Miercoles";
 
	    Crear un aplicacion para reemplazar la palabra
	    "Miercoles" por "Jueves" , y luego imprimir
	    todas las palabra de la frase linea por linea
	  
	 */
	
	
	

}
