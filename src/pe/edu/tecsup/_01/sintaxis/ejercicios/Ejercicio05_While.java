package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio05_While {

    public static void main(String[] args) {

        final int INICIO = 20;

        final int FIN = 4;

        final int DEC = 2;

        int counter = INICIO;

        while (counter >= FIN) {

            counter -= DEC;

            if (counter % 4 == 0) { // % obtiene el resto

                System.out.println("Soy múltiplo de 4: " + counter);

                // continue; // Salta a la siguiente iteracion

            }

            System.out.println("Cuenta abajo: " + counter);

        }

        System.out.println("Final del programa");

    }

}