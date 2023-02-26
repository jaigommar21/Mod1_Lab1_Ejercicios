package pe.edu.tecsup._01.sintaxis.revision.ejercicios;

public class EjerciciosCondicionalesIfElse {

	public static void main(String[] args) {

		// 1.- De acuerdo a la edad de una persona
		// mostrar el siguiente mensaje
		// - Si su edad es de 0 a 3 años , mostrar "Estara en casa"
		// - Si su edad es de 4 a 6 años , mostrar "Estara en el nido"
		// - Si su edad es de 7 a 12 años , mostrar "Estara en la primaria"
		// - Si su edad es de 13 a 17 años , mostrar "Estara en la secundaria"
		// - Si su edad es mayor a 17 años , mostara "Acabo estudios obligatorios"

		int edad_ = 20;
		if (edad_ <= 3) {
			System.out.println("Estar en casa");
		} else if (edad_ <= 6) {
			System.out.println("Estara en el nido");
		} else if (edad_ <= 12) {
			System.out.println("Estara en la primaria");
		} else if (edad_ <= 17) {
			System.out.println("Estara en la secundaria");
		} else {
			System.out.println("Acabo estudios obligatorios");
		}

		int edadPersona = 4;
		if (edadPersona <= 3) {
			System.out.println("Estara en casa");
		} else if (4 <= edadPersona && edadPersona <= 6) {
			System.out.println("Estara en el nido");
		} else if (edadPersona >= 7 && edadPersona <= 12) {
			System.out.println("Estara en la primaria");
		} else if (edadPersona >= 13 && edadPersona <= 17) {
			System.out.println("Estara en la secundaria");
		} else if (edadPersona > 17) {
			System.out.println("Acabo estudios obligatorios");
		}

		short edad = 5;
		if (edad >= 0 && edad <= 3) {
			System.out.println("Estara en casa ");
		} else if (edad >= 4 && edad <= 6) {
			System.out.println("Estara en el nido ");
		} else if (edad >= 7 && edad <= 12) {
			System.out.println("Estara en la primaria ");
		} else if (edad >= 13 && edad <= 17) {
			System.out.println("Estara en la secundaria ");
		} else {
			System.out.println("Acabo estudios obligatorios ");
		}
	}

}
