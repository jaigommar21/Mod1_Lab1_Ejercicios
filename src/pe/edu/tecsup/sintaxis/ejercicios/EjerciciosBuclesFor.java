package pe.edu.tecsup.sintaxis.ejercicios;

public class EjerciciosBuclesFor {

	public static void main(String[] args) {

		// 1.- Imprimir los siguientes numeros
		// 3,6,15,18,21,24
		for (int i = 3; i <= 24; i = i + 3) {

			if (i == 9 || i == 12) {
				continue;
			}

			System.out.println("I:" + i);

		}

		// Falta mejorar
		int n = 3;
		for (int i = 0; n > 0; n += 3) {

			if (n == 9 || n == 12) {
				continue;
			}
			if (n > 24) {
				break;
			}
			System.out.print(n + ";" + "\t");

		}

		// 2.- Sumar los siguientes numeros
		// 1,3,5,7,9,11,13
		int suma = 0;
		for (int i = 1; i <= 13; i = i + 2) {

			suma = suma + i;

			System.out.println("i=" + i);

		}
		System.out.println("Suma=" + suma);

		int suma2 = 0;
		for (int i = 1; i < 14; i += 2) {
			System.out.println("Numero: " + i);
			suma2 = suma2 + i;
		}
		System.out.println("Suma total: " + suma2);

		// Falta sumar
		for (int i = 1; i <= 13; i += 2) {
			System.out.println("Print: " + i);
		}

		
        int suma3=0;
        for(int i=1; i<14; i+=2){
            System.out.print(i+"\t");
            suma3 = suma3 +i;
        }
        System.out.println("");
        System.out.println("La suma total es: "+suma3);
	}

}
