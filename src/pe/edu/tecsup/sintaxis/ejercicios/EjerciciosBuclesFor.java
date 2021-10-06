package pe.edu.tecsup.sintaxis.ejercicios;

public class EjerciciosBuclesFor {

	public static void main(String[] args) {

		// 1.- Imprimir los siguientes numeros
		//      3,6,15,18,21,24
		for( int i = 3 ; i <= 24 ; i=i+3 ) {
			
			if(i == 9 || i == 12) {
				continue;	
			}
			
			System.out.println("I:" + i);
			
		}
		
		// Falta mejorar
//        int n=3;
//        for(int i=0; n>0; n+=3){
//            System.out.print(n+";"+"\t");
//            if(n>21){
//                break;
//            }
//        }

		
		// 2.- Sumar los siguientes numeros
		//      1,3,5,7,9,11,13
				
		
		
	}

}
