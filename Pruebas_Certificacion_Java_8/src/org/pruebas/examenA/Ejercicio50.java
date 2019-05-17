package org.pruebas.examenA;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Ejercicio50 {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
		Predicate<String> test = s -> {
			int i = 0;
			Boolean result = s.contains("pen");
			System.out.println( (i++) + " : " );
			return result;
		};
		
		str.stream()
		.filter(test)
		.findFirst()
		.ifPresent(System.out::print);

	}
	
	

}
