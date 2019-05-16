package org.pruebas.examenA;

import java.util.stream.Stream;

public class Ejercicio37 {

	public static void main(String[] args) {
		Stream.of("Java", "Unix", "Linux")
		.filter(s -> s.contains("n"))
		.peek(s -> System.out.println("PEEK: " + s))
		// A - Error de compilacion
		//.noneMatch();
		// B - Error de compilacion
		//.anyMatch();
		// C - Error de compilacion
		//.allMatch();
		// D - Correcto
		//.findAny();
		// E - Correcto
		.findAny();

	}

}
