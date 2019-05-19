package org.pruebas.examenA;

public class Ejercicio6 {

	public static void main(String[] args) {

		Runnable r = () -> {
			System.out.println("L1 ");
		};
		
		new Thread(r).start();
		new Thread(() -> {
			System.out.println("L2 ");
		}).start();
		System.out.println("L3 ");

	}

}
