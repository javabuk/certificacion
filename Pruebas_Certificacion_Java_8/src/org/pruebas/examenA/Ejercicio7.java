package org.pruebas.examenA;

import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {

	public static void main(String[] args) {
		List<String> sList = Arrays.asList("A", "B", "C", "D");
		//A - Correcto 
		//String str = sList.stream().reduce("",(s1, s2) -> s1.concat(s2));
		//B - No valido imprime AABCD
		//String str = sList.stream().reduce("A",(s1, s2) -> s1.concat(s2));
		//C - No compila
		//String str = sList.stream().reduce((s1, s2) -> s1.concat(s2));
		//D - No valido imprime AABCD 
		String str = sList.stream().reduce("A",String::concat);
		System.out.println(str);
		
	}

}
