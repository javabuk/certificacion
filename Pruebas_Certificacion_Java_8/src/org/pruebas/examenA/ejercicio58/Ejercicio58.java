package org.pruebas.examenA.ejercicio58;

import java.util.Arrays;

public class Ejercicio58 {

	public static void main(String[] args) {
		
		String [] strArray = new String [] { "Tiger", "Rat", "Cat", "Lion" };
		//A - Error de compilación
		//Arrays.sort(strArray, CheckClass::new::checkValue);
		//B - Error de compilación
		//Arrays.sort(strArray, (CheckClass::new) .checkValue);
		//C - Error de compilación
		//Arrays.sort(strArray, (CheckClass::new)::checkValue);
		//D - CORRECTO
		Arrays.sort(strArray, CheckClass::checkValue);
		for(String s : strArray){
			System.out.println(s + " ");
		}
		

	}

}
