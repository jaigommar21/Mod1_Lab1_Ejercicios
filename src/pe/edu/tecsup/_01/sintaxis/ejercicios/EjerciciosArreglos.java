package pe.edu.tecsup._01.sintaxis.ejercicios;

public class EjerciciosArreglos {

	public static void main(String[] args) {

//		char vocales[] = new char[6]; // separar espacio en memoria
//
//		vocales[0] = 'a';
//		vocales[1] = 'e';
//		vocales[2] = 'i';
//		vocales[3] = 'o';
//		vocales[4] = 'u';
//		vocales[5] = '.';

		char vocales[] = {'a','e','i','o','u','.'};
		
		
		System.out.println(vocales);
		System.out.println(vocales[0]);
		System.out.println(vocales[1]);
		System.out.println(vocales[1]);

		// Ejericio : imprimir los otros valores
		// vas a usar un for

		for (int i = 0; i < 6; i++) {
			System.out.println(vocales[i]);
		}
		
		
		for (byte i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
        }


	}

}
