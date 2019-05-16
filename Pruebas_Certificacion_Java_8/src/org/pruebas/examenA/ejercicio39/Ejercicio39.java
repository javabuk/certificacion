package org.pruebas.examenA.ejercicio39;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio39 {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java SE", 300));
		books.add(new Book("Java ME", 120));
		books.stream().filter(b -> b.getBname().equals("Java SE")).forEach(b -> b.setPrice(2000));
		books.forEach(b -> System.out.println(b.name + ":" + b.price));
		
		// D - Correcta
		
	}

}
