package pe.edu.tecsup.mod04._04.lambda.ejercicio;

import java.math.BigDecimal;

interface OperacionMatematica {

    double procesar(double op1, double op2);
}

public class Aplicacion {

    public static void main(String[] args) {

        // Lambda expresion
        OperacionMatematica om = (op1, op2) -> {
            BigDecimal _op1 = new BigDecimal(op1);
            BigDecimal _op2 = new BigDecimal(op2);
           
            BigDecimal s = _op1.add(_op2);
            
            System.out.println(s);
            
            return s.doubleValue();
        };
        
        System.out.println(om.procesar(1.2, 1.4));

        om = (op1, op2) -> {
            BigDecimal _op1 = new BigDecimal(op1);
            BigDecimal _op2 = new BigDecimal(op2);
           
            System.out.println(_op1.subtract(_op2));
            
            return _op1.subtract(_op2).doubleValue();
        };
        
        System.out.println(om.procesar(1.2, 1.4));

        
    }
}
