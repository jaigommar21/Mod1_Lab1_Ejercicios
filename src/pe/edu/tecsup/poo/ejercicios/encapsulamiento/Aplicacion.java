package pe.edu.tecsup.poo.ejercicios.encapsulamiento;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante estudiante1 = new Estudiante("Roberto", "Garcia", 20);
		
		System.out.println("Mi nombre es: " + estudiante1.getNombre());
		System.out.println("Mi apellido es: " +estudiante1.getApellidoPaterno() );
		System.out.println("Mi edad es: " + estudiante1.getEdad());
		System.out.println("Mi sexo es: " + estudiante1.getSexo());
		
		Estudiante estudiante2 = new Estudiante("Marisol", "Quispe", 23);
		
		System.out.println("Mi nombre es: " + estudiante2.getNombre());
		System.out.println("Mi apellido es: " +estudiante2.getApellidoPaterno() );
		System.out.println("Mi edad es: " + estudiante2.getEdad());
		System.out.println("Mi sexo es: " + estudiante2.getSexo());


	}

}
