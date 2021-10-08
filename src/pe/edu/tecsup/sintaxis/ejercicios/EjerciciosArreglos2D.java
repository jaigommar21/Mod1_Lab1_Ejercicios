package pe.edu.tecsup.sintaxis.ejercicios;

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

		System.out.println(notasCursoPorAlumno[0][1]);
		
	}

}
