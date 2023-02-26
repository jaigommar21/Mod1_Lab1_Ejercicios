package pe.edu.tecsup._01.sintaxis.revision.ejercicios;

public class EjerciciosArreglos2D {

	public static void main(String[] args) {

		//  [] [] : el primer corchete son la filas
		//          y el segundo las columnas
		int notasCursoPorAlumno [][] = 
			{ 
				{14, 16, 18,  6},  //  Notas de Alumno 1
				{10,  8, 12, 15},  //  Notas de Alumno 2
				{16, 18, 14, 20}   //  Notas de Alumno 3
			};

		// Obtenemos el valor de la 1ra fila y 2da columna
		System.out.println(notasCursoPorAlumno[0][1]);
		
		// Ejercicios
		
		// obtener el valor
		//   - 15
		System.out.println(notasCursoPorAlumno[1][3]);
				
		//   - 20
		System.out.println(notasCursoPorAlumno[2][3]);
		
		//   - 12
		System.out.println(notasCursoPorAlumno[1][2]);
		
	
		//   - la segunda fila
		//System.out.println();
		int segundaFila[] = notasCursoPorAlumno[1];
		
		System.out.println("Imprime la segunda fila : ");
		for (int i = 0; i < segundaFila.length; i++) {
			System.out.println(segundaFila[i]);

		}
	
	
	}

}
