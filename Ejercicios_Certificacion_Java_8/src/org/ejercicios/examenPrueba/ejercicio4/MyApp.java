package org.ejercicios.examenPrueba.ejercicio4;

import java.util.Arrays;
import java.util.List;

public class MyApp {

	public static void main(String[] args) {
		
		List people = Arrays.asList(new Person("Bob", Person.Gender.MALE), new Person("Alice", Person.Gender.FEMALE));
		
		Person persona = new Person("Bob", Person.Gender.MALE);
		System.out.println(Person.isFemale(persona));
		
		people.stream()
		//.filter( (Person p) -> Person.isFemale(p) )
		.filter( Person::isFemale )
		//.filter( (Person p) -> new Person(p.getName(), p.getGender().isFemale(p)) )
		.forEach((Person p) -> System.out.println(p.getName()));
		
	}

}
/*
* KO
* Respuesta válida:
* D - Todas las opciones de arriba generan un error de compilación
*
*
*/