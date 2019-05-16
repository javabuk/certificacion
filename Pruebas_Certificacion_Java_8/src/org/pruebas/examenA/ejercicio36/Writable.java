package org.pruebas.examenA.ejercicio36;

public interface Writable extends Readable {
	
	public default void write(){
		read();
		System.out.println("Welcome");
	}

}
