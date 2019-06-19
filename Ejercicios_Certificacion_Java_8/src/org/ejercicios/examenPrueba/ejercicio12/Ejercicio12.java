package org.ejercicios.examenPrueba.ejercicio12;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio12 {

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1,6);
		Stream<Integer> numbers = stream.boxed();
		Object object = numbers.collect(Collectors.partitioningBy(x->x*4 > 10));
		System.out.println(object);
	}

}
/**
 * OK
 * Respuesta:
 * D - {false=[1, 2], true=[3, 4]}
 * 
 */
