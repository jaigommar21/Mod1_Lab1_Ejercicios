package pe.edu.tecsup.poo.ejercicios._03_metodos;

public class OperacionesMatematicasNoEstatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 30;
        int numero2 = 10;
        
        OperacionesMatematicasNoEstatico app = new OperacionesMatematicasNoEstatico();
        
        
        // 1.- Crear un metodo que reste dos numeros enteros
		//     e imprima en consola el resultados 
		// 
		app.imprimeResta(numero1,numero2);

		// 2.- Crear un metodo que mulitplique dos numeros enteros
		//     y retorne el valor, imprimir el resulado obtenido
		
        int multiplicacion = app.retornaMultiplicacion(numero1,numero2);
        System.out.println("La multiplicacion es: "+multiplicacion);
 	}
	
	public  void imprimeResta(int a, int b) {
		int resta = a - b ;
		System.out.println("La Resta es: " + resta);
 	}
	public  int retornaMultiplicacion(int a, int b) {
		int multi = a * b ;
		return multi ;
	}	


}
