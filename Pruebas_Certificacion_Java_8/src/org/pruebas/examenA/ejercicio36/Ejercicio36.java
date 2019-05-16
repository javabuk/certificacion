package org.pruebas.examenA.ejercicio36;

public class Ejercicio36 implements Writable {

	public void read() {System.out.println("Hello ");}
	
	public static void main(String[] args){
		Writable canvas = new Ejercicio36();
		canvas.write();
		Writable.close();
	}
	// A - Correcto
}
