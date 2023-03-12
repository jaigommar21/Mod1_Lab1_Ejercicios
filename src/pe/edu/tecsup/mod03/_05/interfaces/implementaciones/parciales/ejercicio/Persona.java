package pe.edu.tecsup.mod03._05.interfaces.implementaciones.parciales.ejercicio;

public  class Persona extends PersonaIncompleta{

    @Override
    public void correr() {
        System.out.println("Me llamo " + this.getNombres() + " y suelo correr por las tardes");
        
    }

    @Override
    public void nadar() {
        System.out.println("Me llamo " + this.getNombres() + " y suelo nadar por las noches");
        
    }

}
