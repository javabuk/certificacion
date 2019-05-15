package org.pruebas.examenA;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {

	public static void main(String[] args) {

		List<StringBuilder> names = new ArrayList<>();
		names.add(new StringBuilder("Tom"));
		names.add(new StringBuilder("Joe"));
		
		names.stream().forEach(s -> s.append("Hello"));
		
		names.forEach(s -> 
		{ s.insert(3, ",");
			System.out.println(s);
		});
		
	}

}
