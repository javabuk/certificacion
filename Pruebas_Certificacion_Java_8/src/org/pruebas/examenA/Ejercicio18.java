package org.pruebas.examenA;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		// Error de compilación 
		// map.compute("1", (k, v) -> (v==null) ? k * k : 0);
		map.compute("2", (k, v) -> (v==null) ? 2 * 2 : 0);
		System.out.println(map.get("1") +  " " + map.get("2"));
	}

}
