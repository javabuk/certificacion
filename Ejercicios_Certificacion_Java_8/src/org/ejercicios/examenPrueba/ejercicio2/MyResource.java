package org.ejercicios.examenPrueba.ejercicio2;

import java.io.IOException;

public class MyResource implements AutoCloseable {

	@Override
	public void close() throws IOException {
		System.out.print("resource ");
		throw new IOException();

	}

}
