package pe.edu.tecsup.poo.ejercicios.encapsulamiento;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante estudiante1 = new Estudiante("Roberto", "Garcia", 20);
		
		System.out.println("Mi nombre es: " + estudiante1.nombre + " " + estudiante1.apellidoPaterno );
		System.out.println("Mi edad es: " + estudiante1.obtenerEdad());
		
		Estudiante estudiante2 = new Estudiante("Marisol", "Quispe", 23);
		
		System.out.println("Mi nombre es: " + estudiante2.nombre + " " + estudiante2.apellidoPaterno );
		System.out.println("Mi edad es: " + estudiante2.obtenerEdad());
				

	}

}
