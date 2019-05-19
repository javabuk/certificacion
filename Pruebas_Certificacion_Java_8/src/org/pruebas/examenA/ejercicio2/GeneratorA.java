package org.pruebas.examenA.ejercicio2;

public class GeneratorA implements IdGenerator {

	private int id = 0;
	
	@Override
	public int getNextId() {
		return ++id;
	}

}
