package org.ejercicios.examenPrueba.ejercicio25;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Ejercicio25 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate date2 = LocalDate.of(2017, Month.JANUARY, 1);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2016, Month.JANUARY, 1, 0, 0);
		LocalDateTime dateTime2 = LocalDateTime.of(2017, Month.JANUARY, 1, 0, 0);
		
		Duration duration1 = Duration.between(date1, date2);
		Duration duration2 = Duration.between(dateTime1, dateTime2);

	}

}
/*
*	OK
*	Respuesta:
* 	C - An exception is thrown at runtime at //1
*
*/