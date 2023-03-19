package pe.edu.tecsup.mod04._04.lambda.ejercicio;

import java.math.BigDecimal;

interface OperacionMatematica {

    double procesar(double op1, double op2);
}

public class Aplicacion {

    public static void main(String[] args) {

        double _op1 = 1.2, _op2 = 1.4;
        
        // first implementation
        OperacionMatematica om = (op1, op2) -> {
           
            BigDecimal __op1 = new BigDecimal(String.valueOf(op1));
            BigDecimal __op2 = new BigDecimal(String.valueOf(op2));
                    
            BigDecimal __sum = __op1.add(__op2);
            
            return __sum.doubleValue();
        };
        
        System.out.println(om.procesar(_op1,_op2));

        
        // second implementation
        om = (op1, op2) -> {
           
            BigDecimal __op1 = new BigDecimal(String.valueOf(op1));
            BigDecimal __op2 = new BigDecimal(String.valueOf(op2));
                    
            BigDecimal __sub = __op1.subtract(__op2);
            
            return __sub.doubleValue();
        };
        
        System.out.println(om.procesar(_op1,_op2));

    }
}
