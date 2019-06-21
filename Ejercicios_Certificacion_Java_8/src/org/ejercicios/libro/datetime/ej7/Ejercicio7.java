package org.ejercicios.libro.datetime.ej7;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ejercicio7 {

	public static void main(String[] args) {
		LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
		DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
		//String formato = f.format(hatDay); - I OK
		//String formato = f.formatDate(hatDay); - II Error de compilacion
		String formato = hatDay.format(f); //- III OK
		System.out.println(formato);		
		
	}
	
}
/*
 * OK
 * Resultado
 * C - I an III 
 * 
 */
