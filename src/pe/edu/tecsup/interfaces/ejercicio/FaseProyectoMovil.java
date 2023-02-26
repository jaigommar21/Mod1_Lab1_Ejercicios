package pe.edu.tecsup.interfaces.ejercicio;

public class FaseProyectoMovil implements FaseProyecto {

	@Override
	public void iniciar() {
		
		System.out.println("Iniciando Proyecto Movil");
	}

	@Override
	public void analizar() {
		
		System.out.println("Analizando Proyecto Movil");

	}

	@Override
	public void disenhar() {
		
		System.out.println("Disenhando Proyecto Movil");

	}

	@Override
	public void construir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void probar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void implantar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String obtenerEstado() {
		// TODO Auto-generated method stub
		return "Analisis";
	}

}
