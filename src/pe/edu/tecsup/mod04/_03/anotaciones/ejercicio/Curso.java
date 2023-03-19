package pe.edu.tecsup.mod04._03.anotaciones.ejercicio;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Curso {

    String nombre();
    int creditos();
    int numeroHoras();
}
