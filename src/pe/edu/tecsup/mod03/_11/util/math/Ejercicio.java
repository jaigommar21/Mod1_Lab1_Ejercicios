package pe.edu.tecsup.mod03._11.util.math;

/**
 * Ejercicio : Crear 5 numeros aleatorios entre 0 y 50
 * 
 * @author developer
 *
 */
public class Ejercicio {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        // random
        for (int i = 0; i < 5; i++) {

            long valor = Math.round(Math.random() * 50) + 3;
            double superior = Math.ceil(valor);
            double potencia = Math.pow(superior, 2);

            System.out.println("Valor: " + valor);
            System.out.println("Entero superior: " + superior);
            System.out.println("Potencia 2: " + potencia);

        }

    }

}
