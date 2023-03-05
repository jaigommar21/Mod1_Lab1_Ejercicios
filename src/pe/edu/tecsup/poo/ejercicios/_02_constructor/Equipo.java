package pe.edu.tecsup.poo.ejercicios._02_constructor;

public class Equipo {
    // atributos

    public String pais;
    public String deporte;
    public int cantIntegrantes;
    public String nombre;
    
    
    public Equipo(String deporte, int cantIntegrantes, String nombre) {
        this.deporte = deporte;
        this.cantIntegrantes = cantIntegrantes;
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Equipo [deporte=" + deporte + ", cantIntegrantes=" + cantIntegrantes + ", nombre=" + nombre + "]";
    }



    

}
