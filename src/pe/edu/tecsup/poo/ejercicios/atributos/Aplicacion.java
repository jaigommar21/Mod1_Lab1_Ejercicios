package pe.edu.tecsup.poo.ejercicios.atributos;

public class Aplicacion {

	public static void main(String[] args) {

		// Defino objetos
		Equipo equipoFutbol = new Equipo();
		Equipo equipoAjedrez = new Equipo();
		
//		Equipo equipos[] = {new Equipo(), new Equipo()};
		
//		Equipo equipos[] = new Equipo[10];
//		equipos[0] = new Equipo();
//		equipos[1] = new Equipo();
		
			
		// Inicializo objetos
		equipoFutbol.pais = "Peru";
		equipoFutbol.deporte = "Futboll";
		equipoFutbol.cantIntegrantes = 24;
		equipoFutbol.nombre = "Los tigres";
		
		equipoAjedrez.pais = "Peru";
		equipoAjedrez.deporte = "Ajedrez";
		equipoAjedrez.cantIntegrantes = 6;
		equipoAjedrez.nombre = "Casablanca";
		
	}
}
