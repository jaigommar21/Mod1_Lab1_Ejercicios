package pe.edu.tecsup.mod04._04.lambda.ejercicio;

import java.math.BigDecimal;

interface OperacionMatematica {

    double procesar(BigDecimal op1, BigDecimal op2);
}

public class Aplicacion {

    public static void main(String[] args) {

        // Lambda expresion
        OperacionMatematica om = (op1, op2) -> {
           
            BigDecimal s = op1.add(op2);
            
            System.out.println(s);
            
            return s.doubleValue();
        };
        
        System.out.println(om.procesar(
                new BigDecimal("1.2"), 
                new BigDecimal("1.4")));

        om = (op1, op2) -> {
           
            System.out.println(op1.subtract(op2));
            
            return op1.subtract(op2).doubleValue();
        };
        
        System.out.println(om.procesar(
                new BigDecimal("1.2"), 
                new BigDecimal("1.4")));

        
    }
}
