package org.pruebas.examenA.ejercicio40;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio40 {

	public static void main(String[] args) {

		List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
		Test t = new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(Test::printValues);
	
		// D - correcta
	}

}
