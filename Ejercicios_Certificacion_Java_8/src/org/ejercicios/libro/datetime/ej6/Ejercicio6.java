package org.ejercicios.libro.datetime.ej6;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio6 {

	public static void main(String[] args) {
		int year = 1874;
		int month = Month.MARCH;
		int day = 24;
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date.isBefore(LocalDate.now()));

	}

}
/**
 * Respuesta:
 * C - The code does not compile
 */
