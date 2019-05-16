package org.pruebas.examenA.ejercicio46;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio46 {

	public static void main(String[] args) {
		List<Product> prd = new ArrayList<>();
		prd.add(new Product(100));
		prd.add(new Product(200));
		prd.add(new Product(300));
		// A - Error de compilación (The method reduce(Product, BinaryOperator<Product>) in the type Stream<Product> is not applicable for the arguments (double, Double::sum))
		//double totalPrice = prd.stream().reduce(0.0, Double::sum);
		// B - The method reduce(Product, BinaryOperator<Product>) in the type Stream<Product> is not applicable for the arguments (double, (<no type> p1, <no type> p2) -> {})
		//double totalPrice = prd.stream().reduce(0.0, (p1,p2) -> p1 + p2);
		// C - Error de compilación (The method reduce(Product, BinaryOperator<Product>) in the type Stream<Product> is not applicable for the arguments (double, (<no type> p1, <no type> p2) -> {}))
		//double totalPrice = prd.stream().parallel().reduce(0.0, (p1,p2) -> p1.getPrice() + p2.getPrice());
		// D
		double totalPrice = prd.stream().parallel().map(p -> p.getPrice()).reduce(0.0, (p1,p2) -> p1 + p2);
		System.out.println(totalPrice);

	}

}
