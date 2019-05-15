package org.pruebas.examenA.ejercicio25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio25 {

	public static void main(String[] args) {
		List<Vehicle> vehicle = Arrays.asList(
				new Vehicle(2,"Car"),
				new Vehicle(3,"Bike"),
				new Vehicle(1,"Truck")
				);
		vehicle.stream()
		// A - No compila (The method comparing(Vehicle::getVName) is undefined for the type Comparable)
		//.sorted(Comparable.comparing(Vehicle::getVName)).reversed()
		// B - CORRECTO
		//.sorted((v1, v2) -> Integer.compare(v1.getvID(), v2.getvID()))
		// C - No compila (Type mismatch: cannot convert from boolean to int)
		//.sorted((v1, v2) -> v1.getvID() < v2.getvID())
		// D - Devuelve 123
		//.map(v -> v.getvID()).sorted()
		// E - CORRECTO
		.sorted(Comparator.comparing((Vehicle v) -> v.getvID()))
		.forEach(System.out::print);

	}

}
