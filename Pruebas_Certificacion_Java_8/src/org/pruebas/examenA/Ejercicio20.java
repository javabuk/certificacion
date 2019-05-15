package org.pruebas.examenA;

import java.util.Arrays;
import java.util.List;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		System.out.println(
				// A - Opción correcta
				listVal.stream().filter(x -> x.length() > 3).count()
				// B - Opción incorrecta, devuelve un cuatro (todos los elementos de la lista)
				// listVal.stream().map(x -> x.length() > 3).count()
				// C - Error de compilación
				// listVal.stream().peek(x -> x.length() > 3).count().get()
				// D - Error de compilación (cannot convert String to int)
				//listVal.stream().filter(x -> x.length() > 3).mapToInt(x -> x).count()
				
				);
		
		
	}

}
