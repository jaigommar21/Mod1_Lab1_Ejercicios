package pe.edu.tecsup.exceptions.personalizado;

public class TestOperationMain {

	public static void main(String[] args) /*throws Exception*/{
		
		double saldo = 500;
		double monto_operacion = 1000;
		
		try {
		
			validarMonto(saldo, monto_operacion);
			
			saldo = saldo - monto_operacion;
			System.out.println("Retirando fondos de S/" + monto_operacion);
			System.out.println("Saldo actual S/" + saldo);
			
		} catch (SinFondosExcepion e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Fin de la aplicacion");
		
		
	}

	/**
	 * 
	 * @param saldo
	 * @param monto
	 * @throws SinFondosExcepion
	 */
	public static void validarMonto(double saldo, double monto)	
			throws SinFondosExcepion{
		
		
		if( monto > saldo) { // Reglas de negocios
			throw new SinFondosExcepion("monto supera al saldo");
		}	
		
	}
	
	
	// Ejercicio : Si se hacen transacciones por montos menores a
	// 5 soles, generar la excepcion MontoNoPermitidoException
	// apoyarse con el metodo validarMontoMinOperacion
	
	
	
	
	
	
}
