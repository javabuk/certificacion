package org.ejercicios.examenPrueba.ejercicio24;

import java.util.Arrays;

public class Ejercicio24 {

	public static void main(String[] args) {
		Arrays.asList(1,2,3)
		.stream()
		.peek(System.out::print)
		.allMatch(number -> number<2);

	}

}
/**
*	OK
*	Resultado:
*	B - 12
*/