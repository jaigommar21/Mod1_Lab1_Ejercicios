package pe.edu.tecsup.poo.ejercicios.metodos;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 20;
		int num2 = 12;
		// 1.- Crear un metodo que reste dos numeros enteros
		//     e imprima en consola el resultados 
		// 
		
		imprimeResta(num1,num2);

		// 2.- Crear un metodo que mulitplique dos numeros enteros
		//     y retorne el valor, imprimir el resulado obtenido
		
		int multi = multiplicaNros(num1,num2);
		System.out.println("La multiplicacion es " + multi);
 	}
	
	public static void imprimeResta(int a, int b) {
		int resta = a - b ;
		System.out.println("La Resta es: " + resta);
 	}
	public static int multiplicaNros(int a, int b) {
		int multi = a * b ;
		return multi ;
	}	


}
