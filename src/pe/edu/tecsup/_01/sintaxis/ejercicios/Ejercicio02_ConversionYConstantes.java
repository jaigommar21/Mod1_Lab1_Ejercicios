package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio02_ConversionYConstantes {
	
    public static void main(String[] args) {
        
    	byte fecha = 5;
        int fechaHoy = (int)fecha; // cast es opcional
        
        int salario = 50000;
        byte salarioActual = (byte)salario; // cast es obligatorio pero peligroso
        
        final float IGV = 0.18f;
        final String NOMBRE_PAIS = "PERU";
        
        System.out.println(fecha + "\n" +
                fechaHoy + "\n" + 
                IGV + "\n" +
                NOMBRE_PAIS + "\n" +
                salarioActual);
    }
}
