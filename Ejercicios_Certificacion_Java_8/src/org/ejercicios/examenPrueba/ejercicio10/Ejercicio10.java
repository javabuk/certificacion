package org.ejercicios.examenPrueba.ejercicio10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio10 {

	public static void main(String[] args) {


		List<Map<Integer, String>> list = new ArrayList<>(); // A
		//List<Map<Integer, String>> list = new ArrayList<Map<>>(); // B
		//List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>(); // C
		//List<Map<Integer, String>> list = new ArrayList<HashMap<Integer, String>>(); // D
		
		Map<Integer, String> people = new HashMap<>();
		people.put(1, "Alice");
		people.put(2, "Bob");
		list.add(people);

	}

}
/**
* OK
* Respuestas A,C
*
*
*/