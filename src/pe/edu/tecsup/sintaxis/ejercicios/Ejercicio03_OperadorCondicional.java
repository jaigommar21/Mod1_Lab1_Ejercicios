package pe.edu.tecsup.sintaxis.ejercicios;

public class Ejercicio03_OperadorCondicional {

	public static void main(String[] args) {

		int x = 5; // otros valores : 25, 50, 100       
        x = (x < 25) ? 25 : x;
        
        System.out.println("Ejemplo: " + x);
	}

}
