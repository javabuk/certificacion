package org.ejercicios.libro.exceptions.ej9;

import java.io.IOException;

public class Light {
	public void turnOn() throws IOException {
		new IOException("Not ready");
	}

	public static void main(String[] b) throws Exception {
		try {
			new Light().turnOn();
		} catch (RuntimeException b) { // y1
			System.out.println(b);
			throw new IOException(); // y2
		} finally {
			System.out.println("complete");
		}
	}
}
/*
* Respuesta:
* C - The code does not compile because of line y1.
*
*/