package org.pruebas.examenA.ejercicio45;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio45 {

	public static void main(String[] args) {
		List<Student> stds = Arrays.asList(
				new Student("Jessy", "Java ME", "Chicago"),
				new Student("Helen", "Java EE", "Houston"),
				new Student("Mark", "Java ME", "Chicago")
				);
		stds.stream()
		.collect(Collectors.groupingBy(Student::getCourse))
		.forEach( (src,res)  -> System.out.println(src));

	}
	//B
}
