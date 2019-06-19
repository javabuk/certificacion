package org.ejercicios.examenPrueba.ejercicio14;

import java.io.IOException;

public class MyApp implements AutoCloseable {

	
	public static void main(String[] args) {
		try ( MyApp myApp = new MyApp()){
			myApp.open();
			myApp.read();
			myApp.close();
		}catch (IOException e){
			System.out.println("Exception caught");
		}
	}

	public String read() throws IOException {
		System.out.println("I am an exception");
		throw new IOException();
	}

	public void open() {
		System.out.println("Opening MyApp ...");
	}

	@Override
	public void close() {
		System.out.println("Closing MyApp ...");
	}
}
/**
 * OK
 * Respuesta:
 * B- 
 * Opening MyApp ...
I am an exception
Closing MyApp ...
Exception caught
 * 
 * 
 */
