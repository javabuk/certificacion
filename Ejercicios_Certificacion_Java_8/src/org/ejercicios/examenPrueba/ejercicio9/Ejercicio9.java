package org.ejercicios.examenPrueba.ejercicio9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ejercicio9 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		Future<String> asyncResult = threadPool.submit(new Callable<String>(){

			@Override
			public String call() throws Exception {
				Thread.sleep(1000);
				return "Hello world!";
			}
			
			
		});
		
		while(!asyncResult.isDone()){
			Thread.sleep(200);
		}

		System.out.println(asyncResult.get());
		threadPool.shutdown();
		
	}

}
/**
 * OK
 * 
 * Respuesta:
 * D - It prints "Hello world!"
 * 
 * 
 */
