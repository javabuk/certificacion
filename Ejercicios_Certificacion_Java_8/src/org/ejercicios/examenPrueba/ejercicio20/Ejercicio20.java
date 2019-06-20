package org.ejercicios.examenPrueba.ejercicio20;

import java.util.Locale;
import java.util.ResourceBundle;

public class Ejercicio20 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("fr"));
		Locale locale = new Locale("it","IT");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("mensajes",locale);
		String message = resourceBundle.getString("greeting");
		System.out.println(message);

	}

}
/**
 * OK
 * Resultado:
 * D - It prints "hello"
 * 
 * 
 */
