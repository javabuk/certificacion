package org.pruebas.examenA;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ejercicio23 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(200);
		// A - No compila 
		// Function<Integer> funIntf = n -> n * 5;
		// B - No compila
		// Consumer<Integer> funIntf = n -> n * 5;
		// C - CORRECTO
		UnaryOperator<Integer> funIntf = n -> n * 5;
		// D - No compila
		// IntFuction funIntf = n -> n * 5;
		nums.replaceAll(funIntf);
		System.out.println(nums);

	}

}
