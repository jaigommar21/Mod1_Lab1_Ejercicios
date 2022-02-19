package pe.edu.tecsup.poo.herencia.caso4;

public class AlumnoExterno extends Alumno {

	private String codTemporal;
	
	public void setCodTemporal(String codTemporal) {
		this.codTemporal = codTemporal;
	}
	
	@Override // Sobrecarga en POO
	public void imprimirDatos() {

		//super.imprimirDatos();
		
		System.out.println("Nombre -> " +  this.nombre);
		System.out.println("Edad -> " +  this.edad);
		System.out.println("Dni -> " +  this.dni);
		System.out.println("codTemporal -> " +  this.codTemporal);
		
	}
	
	/*
	public void imprimirDatos() {
		
		System.out.println("Nombre -> " +  this.nombre);
		System.out.println("Edad -> " +  this.edad);
		System.out.println("Dni -> " +  this.dni);
		System.out.println("codTemporal -> " +  this.codTemporal);
		
	}
	//*/
}
