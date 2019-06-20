package org.ejercicios.examenPrueba.ejercicio23;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio23 {

	public static void main(String[] args) {

		int number1 = 3;
		int number2 = 5;
		// insert here
		
		//Function<Integer,Integer> func = (int1, int2) -> int1 * int2; // A - No compila
		//Function<Integer,Integer, Integer> func = (int1, int2) -> int1 * int2; // B - No compila
		//BiFunction<Integer,Integer> func = (int1, int2) -> int1 * int2; // C - No compila
		BiFunction<Integer,Integer, Integer> func = (int1, int2) -> int1 * int2; // D - OK
		
		System.out.println(func.apply(number1,number2));

	}

}
/**
 * OK
 * Resultado: D
 * 
 */
