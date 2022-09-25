package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestMain5 {

	public static void main(String[] args) {
		
		List<Auto> autos = new ArrayList<Auto>();
		
		autos.add(new Auto("X001", "Toyota"));
		autos.add(new Auto("X002", "Nissan"));
		autos.add(new Auto("X003", "Pegaut"));

		
		Auto autoBuscar = new Auto("X002", "Nissan");
		
		if (autos.contains(autoBuscar)) {
			System.out.println("Auto encontrado");
		} else {
			System.out.println("Auto NO encontrado");
		}
		
	}

}
