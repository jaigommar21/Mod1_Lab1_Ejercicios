package pe.edu.tecsup.mod03._05.interfaces.implementaciones.parciales.ejercicio2;

public class EstudianteInstituto 
    extends Estudiante
    implements ActividadesEstudio{

    @Override
    public void llevarCursos() {
        
        System.out.println("El estudiante " + this.nombre + " lleva cursos");
    }

}
