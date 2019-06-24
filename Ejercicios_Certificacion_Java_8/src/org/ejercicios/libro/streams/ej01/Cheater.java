package org.ejercicios.libro.streams.ej01;

import java.util.*;

public class Cheater {
	int count = 0;

	public void sneak(Collection<String> coll) {
		//coll.stream().peek(System.out::println); A - No hace nada
		//coll.stream().peek(System.out::println).findFirst(); B - Imprime una linea por pantalla
		//coll.stream().peek(r -> System.out.println(r)).findFirst(); C - Imprime una linea por pantalla
		coll.stream().peek(r -> {count++; System.out.println(r); }).findFirst(); // D - Imprime una linea por pantalla
	}

	public static void main(String[] args) {
		Cheater c = new Cheater();
		c.sneak(Arrays.asList("weasel"));
	}
}
/*
 * Respuestas: B,C,D
 * 
 */
