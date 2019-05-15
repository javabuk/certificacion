package org.pruebas.examenA.ejercicio22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio22 {

	public static void main(String[] args) {
		Stream<List<Person>> perStream = Stream.of(
				Arrays.asList(new Person("Jack"), new Person("Jane")),
				Arrays.asList(new Person("John")),
				Arrays.asList(new Person("Tom"), new Person("Tim"))
				);
		Stream<Person> persons = perStream.flatMap(personList -> personList.stream());
		persons.forEach(p -> System.out.print(p.getName() + " "));
		
	}

}
