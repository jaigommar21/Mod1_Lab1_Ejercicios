package pe.edu.tecsup.poo.herencia.caso4;

public class Aplicacion {

	public static void main(String[] args) {
		
		// instanciar la clase
		Alumno alumno = new Alumno();
		
		// Deseo agregar el nombre y la edad
		// ¿ Que altenativa tengo?

		alumno.setNombre("Jose");
		alumno.setEdad(26);
		alumno.imprimirDatos();
		
		AlumnoInterno alumnoInterno = new AlumnoInterno();		
		alumnoInterno.setNombre("Maria");
		alumnoInterno.setEdad(22);
		alumnoInterno.imprimirDatos();
		
		// Crear un instancia del alumno externo
		// cuyo nombre es Joseph y tiene 23 anhos.
		AlumnoExterno alumnoExterno = new AlumnoExterno();
        alumnoExterno.setNombre("Joseph");
        alumnoExterno.setEdad(23);
        alumnoExterno.imprimirDatos();
		
        
        // Ejercicio : Crear el metodo validar, de modo que 
        //             Si la edad es menor o igual a 18
        //             indique que es un estudiante menor de edad
        //             caso contrario indique que es un estudiante mayor de edad
        
        
	}

}
