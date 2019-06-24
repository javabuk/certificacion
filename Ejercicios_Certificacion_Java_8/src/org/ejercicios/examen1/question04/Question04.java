package org.ejercicios.examen1.question04;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question04 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> data = new CopyOnWriteArrayList<>(Arrays.asList("a","B","c","D"));
		
		new Thread() {// Thread 1
			public void run(){
				data.set(0, "a");
				data.set(1, "b");
				data.set(2, "c");
				data.set(3, "d");
			}
		}.start();
		
		new Thread() {// Thread 2
			public void run(){
				data.set(0, "A");
				data.set(1, "B");
				data.set(2, "C");
				data.set(3, "D");
			}
		}.start();

		System.out.println(data);
	}

}
