package pe.edu.tecsup.poo.ejercicios._04_encapsulamiento;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante estudiante1 = new Estudiante("Roberto", "Garcia", 20,"M");
		
		System.out.println("Mi nombre es: " + estudiante1.getNombre());
		System.out.println("Mi apellido es: " +estudiante1.getApellidoPaterno() );
		System.out.println("Mi edad es: " + estudiante1.getEdad());
		System.out.println("Mi sexo es: " + estudiante1.getSexo());
		
		Estudiante estudiante2 = new Estudiante("Marisol", "Quispe", 23,"F");
		
		System.out.println("Mi nombre es: " + estudiante2.getNombre());
		System.out.println("Mi apellido es: " +estudiante2.getApellidoPaterno() );
		System.out.println("Mi edad es: " + estudiante2.getEdad());
		System.out.println("Mi sexo es: " + estudiante2.getSexo());

		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Eduardo");
		estudiante3.setApellidoPaterno("Garcia");
		estudiante3.setEdad(18);
		estudiante3.setSexo("M");
				
		System.out.println("Mi nombre es: " + estudiante3.getNombre());
		System.out.println("Mi apellido es: " +estudiante3.getApellidoPaterno() );
		System.out.println("Mi edad es: " + estudiante3.getEdad());
		System.out.println("Mi sexo es: " + estudiante3.getSexo());

	}

}
