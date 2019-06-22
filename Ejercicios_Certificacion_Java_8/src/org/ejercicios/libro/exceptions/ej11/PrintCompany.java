package org.ejercicios.libro.exceptions.ej11;

import java.io.Closeable;

public class PrintCompany {
	class Printer implements Closeable { // r1
		public void print() {
			System.out.println("This just in!");
		}

		public void close() {
		}
	}

public void printHeadlines() {
try {Printer p = new Printer()} { // r2
p.print();
}
}

	public static void main(String[] headlines) {
		new PrintCompany().printHeadlines(); // r3
	}
}
/*
 * Respuesta:
 * C - The code does not compile because of line r2.
 */
