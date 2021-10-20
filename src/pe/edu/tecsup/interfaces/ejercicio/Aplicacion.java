package pe.edu.tecsup.interfaces.ejercicio;

public class Aplicacion {

	public static void main(String[] args) {

		/*
		FaseProyecto fase;  // FaseProyecto es una interfase
		
		fase = new FaseProyectoWeb();  // FaseProyectoWeb es una clase
		fase.iniciar();
		fase.analizar();
		fase.disenhar();
		//*/

		/*
		// Interfase var = new Class()
		FaseProyecto fase = new FaseProyectoWeb();
		ejecutar(fase);
		//*/

		//*
		
		System.out.println("------------");
		ejecutar(new FaseProyectoWeb());
		System.out.println("------------");
		ejecutar(new FaseProyectoMovil());
		System.out.println("------------");
		ejecutar(new FaseProyectoRedes());		
		//*/
	}

	private static void ejecutar(FaseProyecto f) {
		// TODO Auto-generated method stub
		f.iniciar();
		f.analizar();
		f.disenhar();
		System.out.println(f.obtenerEstado());
	}

	
	
	
}
