package org.pruebas.examenA.ejercicio21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ejercicio21 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new R());
		Future<String> f1 = es.submit(new C());
		System.out.println(f1.get());
		es.shutdown();
	}

}
