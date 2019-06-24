package org.ejercicios.examen1.question24;

import java.util.ArrayList;
import java.util.List;

public class Question24 {

	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<>();
		for( char c = 'Z'; c >= 'a'; c--){
			list.add(c);
		}
		
		int amount = list.stream().filter(c -> c.compareTo('u')>0).count();
		System.out.println(amount);
	}

}
