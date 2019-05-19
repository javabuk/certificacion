package org.pruebas.examenA.ejercicio4;

public class Test {

	public static void main(String[] args) {
		
		GreeterA g = (s) -> {
			return s + " Welcome!";
		};
		
		System.out.println(g.greet("Kathy"));

		/*GreeterB gb = (s) -> {
			return s + " Welcome!";
		};*/
		
		// A - CORRECTO
		// B,C,D - No compilan
		
	}

}
