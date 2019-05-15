package org.pruebas.examenA.ejercicio28;

import java.util.concurrent.CyclicBarrier;

public class Ejercicio28 {

	public static void main(String[] args) {
		Master master = new Master();
		// A - Error de compilación	(The constructor CyclicBarrier(Master) is undefined )	 
		// CyclicBarrier cb = new CyclicBarrier(master);
		// B - Solo ejecuta el worker
		// CyclicBarrier cb = new CyclicBarrier(1);
		// C - No ejecuta ninguno
		// CyclicBarrier cb = new CyclicBarrier(2, master);
		// D - CORRECTO
		CyclicBarrier cb = new CyclicBarrier(1, master);
		Worker worker = new Worker(cb);
		worker.start();

	}

}
