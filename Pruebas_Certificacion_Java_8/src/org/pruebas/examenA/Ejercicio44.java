package org.pruebas.examenA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio44 {

	public static void main(String[] args) {
		Integer[] numberArray = {1,2,3,4,5,6,7,8};
		List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(numberArray));
		List<Integer> myList = Collections.synchronizedList(new ArrayList<>());
		listOfNumbers
		// B - Los imprime en vertical
		//.parallelStream()
		.stream()
		.map(e -> { myList.add(e); return e;})
		// A - Los imprime en vertical
		//.peek(e -> { myList.add(e); })
		.forEachOrdered(e -> System.out.println(e + " "));
		System.out.println();
		myList
		.stream()
		// C - Los imprime en vertical
		//.parallelStream()
		.forEach(e -> System.out.print(e + " "));
		// D - - Los imprime en vertical
		//.forEachOrdered(e -> System.out.print(e + " "));

	}

}
