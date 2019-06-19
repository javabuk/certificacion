package org.ejercicios.examenPrueba.ejercicio15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//ExecutorService threadPool = new ExecutorService(); // A - Error de compilación
		//ExecutorService threadPool = new ExecutorService(1); // B - Error de compilación
		//ExecutorService threadPool = Executors.newFixedThreadPool(); // C - Error de compilación
		//ExecutorService threadPool = Executors.newFixedThreadPool(1); // D - OK
		//ExecutorService threadPool = Executors.newCachedThreadPool(); // E - OK
		//ExecutorService threadPool = Executors.getCachedThreadPool(); // F - Error de compilación
		ExecutorService threadPool = Executors.newSingleThreadExecutor(); // G - 
	}

}
/**
 * OK
 * Respuesta: D,E,G
 *  
 */
