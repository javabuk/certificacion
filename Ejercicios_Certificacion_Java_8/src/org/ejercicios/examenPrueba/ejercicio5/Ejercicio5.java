package org.ejercicios.examenPrueba.ejercicio5;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ejercicio5 {

	public static void main(String[] args) {
		Period period = Period.of(1,2,3);
		Duration duration = Duration.of(10000, ChronoUnit.SECONDS);
		System.out.println(period + " " + duration);

	}

}
/**
 * OK
 * Respuesta:
 * d - P1Y2M3D PT2H46M40S
 * 
 * 
 */
