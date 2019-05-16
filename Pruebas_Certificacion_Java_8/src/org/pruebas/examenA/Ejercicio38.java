package org.pruebas.examenA;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ejercicio38 {

	public static void main(String[] args) {
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("zzzz", Locale.US);
		System.out.println("Result: " + sdf.format(new Date()));

	}

}
