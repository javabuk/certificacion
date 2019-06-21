package org.ejercicios.libro.datetime.ej12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Ejercicio12 {

	public static void main(String[] args) {
		LocalDate pieDay = LocalDate.of(2017, Month.JANUARY, 23);
		LocalTime midnight = LocalTime.of(0, 0);
		LocalDateTime pieTime = LocalDateTime.of(pieDay, midnight);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		f.format(pieDay);
		f.format(pieTime);
		 f.format(midnight);

	}

}
/*
* Respuesta:
* C - The code throws an exception on line 20
*/