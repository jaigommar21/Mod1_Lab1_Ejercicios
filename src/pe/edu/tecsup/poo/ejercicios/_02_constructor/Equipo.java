package pe.edu.tecsup.poo.ejercicios._02_constructor;

public class Equipo {
    // atributos

    public String pais;
    public String deporte;
    public int cantIntegrantes;
    public String nombre;
    
    
    public Equipo( int cantIntegrantes, String nombre) {

        this.cantIntegrantes = cantIntegrantes;
        this.nombre = nombre;
    }


    
    public String toString() {
        return "Equipo [cantIntegrantes=" + cantIntegrantes + ", nombre=" + nombre + "]";
    }


    

}
