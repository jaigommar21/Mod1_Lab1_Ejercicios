package pe.edu.tecsup.mod04._09.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
				
		List<Integer> numbers = new ArrayList<Integer>(); // parametrizado
		
		// Objetos Cadena que se agregan a la lista
		numbers.add(12);    // posicion 0
		numbers.add(21);	// posicion 1
		numbers.add(14);
		numbers.add(18);
		numbers.add(13);
		
		System.out.println(numbers); // Imprimo el listado		
		
        // ---------------------------------------------------------
		//  Obtener el menor valor
        // ---------------------------------------------------------
		Stream<Integer> streamNumbers = numbers.stream();
		
		Optional<Integer> minValue = streamNumbers.min(Integer::compare);
		
		if(minValue.isPresent())
		    System.out.println(minValue.get());

        // ---------------------------------------------------------
        //  Obtener el mayor valor
        // ---------------------------------------------------------
        Stream<Integer> otherStreamNumbers = numbers.stream();

        Optional<Integer> maxValue = otherStreamNumbers.max(Integer::compare);
        
        if(maxValue.isPresent())
            System.out.println(maxValue.get());
		
        // ---------------------------------------------------------
        //  Obtener los valores ordenados
        // ---------------------------------------------------------
        Stream<Integer> sortedStream  = numbers.stream().sorted();
		sortedStream.forEach((n)->System.out.print(n + " "));
		

        // ---------------------------------------------------------
        //  Obtener los valores ordenados y solo impares
        // ---------------------------------------------------------
		System.out.println("");
        Stream<Integer> filterStream 
            = numbers.stream().sorted().filter((n)->( n % 2 ) == 1);
        filterStream.forEach((n)->System.out.print(n + " "));

        
        // ---------------------------------------------------------
        //  Obtener los valores ordenados, impares y mayores que 15
        // ---------------------------------------------------------
        System.out.println("");
        Stream<Integer> otherFilterStream 
            = numbers.stream().sorted().filter((n)->( n % 2 ) == 1)
                                       .filter((n)-> n > 15) ;
        otherFilterStream.forEach((n)->System.out.print(n + " "));
        
	}

}

