package pe.edu.tecsup._01.sintaxis.ejercicios;

/**
 * Programa que operara arreglo
 * 
 * @author jgomez
 *
 */
public class Ejercicio06_Array {

	public static void main(String[] args) {
		
		//Definir constantes
		final int VALOR_INICIAL = 0;
		final int RAZON = 4;
		
		// Definir variables
		int arreglo[] = new int[10];
		int suma = 0;
		
		// Inicializamos arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = VALOR_INICIAL;
		}

		// Realiza logica del proceso : LOGICA DEL NEGOCIO
		arreglo[0] = RAZON; // asigna el primer valor de la secuencia
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == RAZON)
				arreglo[i] = arreglo[i] + RAZON;
			else
				arreglo[i] = arreglo[i - 1] + RAZON;

			System.out.println(arreglo[i]);

		}
		
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}

		// Presentar resultados
		System.out.println("Suma : " + suma);
	}

}
