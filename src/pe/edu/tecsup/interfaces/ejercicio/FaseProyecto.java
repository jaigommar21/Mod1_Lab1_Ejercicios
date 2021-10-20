package pe.edu.tecsup.interfaces.ejercicio;

public interface FaseProyecto {
	
    public void iniciar();
    public void analizar();
    public void disenhar();
    public void construir();
    public void probar();
    public void implantar();
    public String obtenerEstado();

}
