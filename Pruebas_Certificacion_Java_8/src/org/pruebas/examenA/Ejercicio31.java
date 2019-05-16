package org.pruebas.examenA;

import java.util.Arrays;
import java.util.List;

public class Ejercicio31 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		System.out.println(doSum(nums));

	}

	private static int doSum(List<Integer> list) {
		
		// A - Devuelve30
		// return list.stream().mapToInt(i -> i + i).sum();
		// B - Error de compilación (The method sum() is undefined for the type Stream<Integer>)
		// return list.stream().map(i -> i + i).sum();
		// C - Error de compilación (The method sum() is undefined for the type Stream<Integer>)
		// return list.stream().map(i -> i).sum();
		// D - Correcto
		return list.stream().mapToInt(i -> i).sum();
	}

}
