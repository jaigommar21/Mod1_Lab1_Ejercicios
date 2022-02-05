package pe.edu.tecsup.sintaxis.ejercicios;

/**
 * Mi primer ejercicio
 * @author jgomez
 *
 */
public class Ejercicio01_DefinicionVariables {

	/**
	 * Metodo principal
	 * @param args
	 */
	public static void main(String[] args) {

		// Definir variables
		String anho;
		String nombreMes;
		byte dia;
		String nombreDia;
		boolean esDiaLaboral;
		String mensajeDiaLaboral;

		// Inicializar variables
		anho = "2022";
		nombreMes = "Febrero";
		dia = 5;
		nombreDia = "Cinco";
		esDiaLaboral = true;
		mensajeDiaLaboral = "es dia laboral";

		// Procesar
		System.out.println("Hoy dia es " + nombreDia + " (" + dia + ") de " + nombreMes + " del año " + anho + " y "
				+ mensajeDiaLaboral);

	}

}
