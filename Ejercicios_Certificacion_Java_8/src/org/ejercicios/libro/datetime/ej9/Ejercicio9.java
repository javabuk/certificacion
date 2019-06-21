package org.ejercicios.libro.datetime.ej9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ejercicio9 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2017, 3, 12);
		//LocalTime localTime = LocalTime.of(2,0);
		LocalTime localTime = LocalTime.of(3,0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);

	}

}
/*
 * Respuesta
 * C - Either of the above will run without throwing an exception.
 * 
 */
