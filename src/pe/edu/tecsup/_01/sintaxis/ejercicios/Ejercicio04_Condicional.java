package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio04_Condicional {

//*
	public static void main(String[] args) {
        float sueldo = 4000.f;
        int numeroDePagas = 14;
        final float UIT = 4600;
        float sueldoTotal = numeroDePagas * sueldo;
        if(sueldoTotal > 7*UIT) {
            System.out.println("paga impuestos");
        }else {
        	System.out.println("no paga impuestos");
        }
    }
//*/
	
	
/*	
	public static void main(String[] args) {
        int sueldo = 1000;
        int sueldoanual= sueldo*14;
        int UIT = 4600;
    
        
        if( sueldoanual > (7*UIT) ) {
            System.out.println("pagas impuesto");
        }else if(sueldoanual < (7*UIT) ) {
            System.out.println("no pagas impuesto");
            }
    }
//*/
	
/*	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int sueldo_mensual=4000, sueldo_anual=sueldo_mensual*14, 
                UIT=4600, total=4600*7;
        
    if (sueldo_anual>total) {
        System.out.println("El trabajador debe pagar impuesto");
    } 
    else 
        System.out.println("El trabajador No debe pagar impuesto");
    }	
//*/
	

	/*
	      public static void main(String[] args) {
        // TODO Auto-generated method stub
        int Sueldo=4000;
        //tiene 14 pagos
        int Sueldo_neto=4000*14;
        int UIT=4600;
        
        if(Sueldo_neto> UIT*7 )
        {
            System.out.println("Si Paga impuesto, su sueldo es de :  "+ Sueldo_neto);
        }
        else System.out.println("NO PAGA IMPUESTO- SU SUELDO ES DE -"+Sueldo_neto);

    }
    //*/
	
	
	 
    
}

	