package org.pruebas.examenA;

import java.util.Arrays;
import java.util.List;

public class Ejercicio12 {

	public static void main(String[] args) {
		List<Person> prog = Arrays.asList(
			new Person ("Smith", 1500),
			new Person ("John", 2000),
			new Person ("Joe", 1000)
				);
		
		double dVal = prog.stream()
				.filter(s -> s.getFirstName().startsWith("J"))
				.mapToInt(Person::getSalary)
				.average()
				.getAsDouble();
		System.out.println(dVal);

	}

}
