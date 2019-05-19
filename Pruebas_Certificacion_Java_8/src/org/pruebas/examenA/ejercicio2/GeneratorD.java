package org.pruebas.examenA.ejercicio2;

public class GeneratorD implements IdGenerator {

	private int id = 0;
	
	@Override
	public int getNextId() {
		synchronized (new GeneratorD()) {
			return ++id;
		}
	}

}
