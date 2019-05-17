package org.pruebas.examenA;

import java.util.Arrays;
import java.util.List;

public class Ejercicio52 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 20, 30, 20, 20);
		// A - Devuelve false
		//boolean b = nums.stream().noneMatch(n -> n==20);
		// B - CORRECTO
		//boolean b = nums.stream().filter(n -> n == 20).allMatch(n -> n == 20);
		// C - Devuelve false
		//boolean b = nums.stream().filter(n -> n == 20).noneMatch(n -> n == 20);
		// D - CORRECTO
		//boolean b = nums.stream().map(n -> 20).noneMatch(n -> n == 10);
		// E - Devuelve false
		boolean b = nums.stream().allMatch(n -> n == 20);
		
		System.out.println(b);
		
	}

}
