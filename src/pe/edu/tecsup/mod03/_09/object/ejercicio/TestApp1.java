package pe.edu.tecsup.mod03._09.object.ejercicio;

public class TestApp1 {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setCodigo(100);
		persona1.setNombre("Miguel");
		
		System.out.println(persona1);
//		System.out.println(persona1.toString());

		Persona persona2 = new Persona();
		persona2.setCodigo(100);
		persona2.setNombre("Miguel");
		
		System.out.println(persona2);
		
//		Persona persona3 = persona1;
		
		boolean res1 = persona1.equals(persona2);
		System.out.println("Es igual? " + res1);
		
//		boolean res2 = persona1.equals(persona3);
//		System.out.println("Es igual? " + res2);
		
	}

}
