package org.ejercicios.libro.exceptions.ej7;

public class WhaleSharkException extends Exception {
	public WhaleSharkException() {
		super("Friendly shark!");
	}

	public WhaleSharkException(String message) {
		super(new Exception(new WhaleSharkException()));
	}

	public WhaleSharkException(Exception cause) {
	}
}
/*
*
* Respuesta
* D - Three
*/