package org.pruebas.examenA;

import java.util.Optional;

public class Ejercicio51 {

	public static void main(String[] args) {
		Optional<String> city1 = getCountry("Paris");
		Optional<String> city2 = getCountry("Las Vegas");
		System.out.println(city1.orElse("Not Found"));
		if(city2.isPresent()){
			city2.ifPresent(x -> System.out.println(x));
		}else{
			System.out.println(city2.orElse("Not Found"));
		}

	}
	
	public static Optional<String> getCountry(String loc){
		Optional<String> couName = Optional.empty();
		if ("Paris".equals(loc))
			couName = Optional.of("France");
		else if ("Mumbai".equals(loc))
			couName = Optional.of("india");
		return couName;
	}

}
