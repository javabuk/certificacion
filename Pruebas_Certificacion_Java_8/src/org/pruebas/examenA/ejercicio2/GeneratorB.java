package org.pruebas.examenA.ejercicio2;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratorB implements IdGenerator {

	private AtomicInteger id = new AtomicInteger(0);
	
	@Override
	public int getNextId() {
		return id.incrementAndGet();
	}

}
