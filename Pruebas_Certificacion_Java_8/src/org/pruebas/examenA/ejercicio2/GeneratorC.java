package org.pruebas.examenA.ejercicio2;

public class GeneratorC implements IdGenerator {

	private volatile int id = 0;
	@Override
	public int getNextId() {
		return  ++id;
	}

}
