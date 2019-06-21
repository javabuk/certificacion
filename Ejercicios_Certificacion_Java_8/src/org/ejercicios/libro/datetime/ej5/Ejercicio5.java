package org.ejercicios.libro.datetime.ej5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ejercicio5 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2017, 3, 12);
		LocalTime localTime = LocalTime.of(1, 0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);
		Duration duration = Duration.ofHours(3);
		ZonedDateTime later = z.plus(duration);
		System.out.println(later.getHour());

	}

}

/**
 * Respuesta:
 * B - 5
 */