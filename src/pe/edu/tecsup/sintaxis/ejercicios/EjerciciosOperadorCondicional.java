package pe.edu.tecsup.sintaxis.ejercicios;

public class EjerciciosOperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.- Sin interesar el valor de la variable "a", asignar siempre 
		//     a la variable entera "c" el valor de la variable "a":
		//     caso1 : a = 50    , caso2 : a = 100
		
		int a= 150;
		int c= (a>=100) ? a: a;
		System.out.println(c);
		
		c= true ? a: -1;
		
		c = (a != 'a') ? a : a;
		System.out.println(c);

		
		//int a=100;
		//int c=0;
		c = (a>c) ? a : a;
		System.out.println(c);
		
		
		// 2.- Asignar a la variable c el valor de acuerdo a las siguientes
		//     condiciones
		//    - asignar el valor de la variable a , cuando esta sea menor a 25
		//    - si la variable a es mayor o igual a 25 asignar siempre 25  
		

	}

}
