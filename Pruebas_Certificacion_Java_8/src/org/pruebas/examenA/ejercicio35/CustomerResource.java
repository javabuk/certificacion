package org.pruebas.examenA.ejercicio35;

import java.io.Closeable;
import java.io.IOException;

public class CustomerResource implements Closeable {
	
	private String resourceName;
	
	public CustomerResource (String name){
		resourceName = name;
	}

	
	
	// A - Error de compilación (AutoCloseable es una interfaz no una clase)
	// B - Correcta
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	// C - Error de compilación (Closeable es una interfaz no una clase)
	// D - Error de compilación (The resource type CustomerResource does not implement java.lang.AutoCloseable)
	/*
	public void autoClose() throws IOException {
	}*/
	// E - Error de compilación (The resource type CustomerResource does not implement java.lang.AutoCloseable)
	/*public boolean close() throws IOException {
		return false;
	}*/
	// F - Error de compilación (The resource type CustomerResource does not implement java.lang.AutoCloseable)
	/*public void close() throws IOException {
	}*/
	
	
}
