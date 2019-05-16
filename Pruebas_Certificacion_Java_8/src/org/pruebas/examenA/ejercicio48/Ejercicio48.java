package org.pruebas.examenA.ejercicio48;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ejercicio48 {

	public static void main(String[] args) {
		fly ( () -> new Bird() );
		fly(Penguin::new);

	}
	
	// A - No compila
	/*static void fly(Consumer<Bird> bird){
		bird::fly();
	}*/
	// B - No compila
	/*
	static void fly(Consumer<? extends Bird> bird){
		bird.accept().fly();
	}
	*/
	// C - CORRECTO
	static void fly(Supplier<Bird> bird){
		bird.get().fly();
	}
}
