package pe.edu.tecsup._01.sintaxis.revision.ejercicios;

public class EjerciciosCondicionales {

	public static void main(String[] args) {

		// 1.- Si tengo mas de 4.15 soles puedo comprar dolares
		// Imprimir mensaje :"Puedo comprar dolares"

		int monto = 1;
		if (monto > 4.15) {
			System.out.println("Puedo Comprar Dolares");
		}

		int ahorro = 5;
		final float TIPO_CAMBIO = 4.15f;
		if (ahorro >= TIPO_CAMBIO) {
			System.out.println("Si puedo comprar dolares Mi ahorro es " + ahorro);
		} else {
			System.out.println("No puedo comprar dolares Mi ahorro es " + ahorro);
		}

		// 2.- Si tengo mas de 4.15 soles puedo comprar dolares
		// caso contrario no puedo compralo
		// + : Imprimir mensaje :"Puedo comprar dolares"
		// - : Imprimir mensaje :"No Puedo comprar dolares"

		monto = 2;

		if (monto > 4.15) {
			System.out.println("Puedo Comprar Dolares");
		} else {
			System.out.println("No puedo Comprarlo");
		}

		double saldo = 4.6;

		if (saldo > 4.5) {
			System.out.println("Puedo comprar dolares");
		} else {
			System.out.println("No puedo comprar dolares");
		}

	}

}
