package pe.edu.tecsup.poo.herencia.caso4;

public class AlumnoInterno extends Alumno {

	
	public void accederAtributosHeredados() {
		
		// Como accedo a los atributos edad y nombre ?
		// Rpta : usando el identificador this.
		
		// Desde la clase hijs , solo se accede
		// al atributo si su visibilidad es publica, protected
		// la visibilida privada no nos permite acceder
		
		System.out.println(this.edad); 
		
		
	}
}
