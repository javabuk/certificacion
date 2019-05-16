package org.pruebas.examenA;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio49 {

	public static void main(String[] args) {
		//List<String> str = Arrays.asList("my", "pen")
		AtomicInteger[] var = new AtomicInteger[5];
		for (int i = 0; i < 5; i++){
			var [i] = new AtomicInteger();
		}

		for (int i = 0; i<var.length; i++){
			var [i].incrementAndGet();
			if (i==2)
				var[i].compareAndSet(2,4);
			System.out.println(var[i] + " ");
		}
		
	}
	// D
}
