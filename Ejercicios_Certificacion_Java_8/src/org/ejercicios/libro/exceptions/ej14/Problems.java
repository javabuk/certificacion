package org.ejercicios.libro.exceptions.ej14;

public class Problems {
	public void doIHaveAProblem() throws MissingMoneyException, MissingFoodException {
		System.out.println("No problems");
	}

	public static void main(String[] lots) throws MissingMoneyException, MissingFoodException {
		try {
			final Problems p = new Problems();
			p.doIHaveAProblem();
		} catch (Exception e) {
			throw e;
		}
	}
}
/*
* Respuesta:
* C - I and III
*
*/