package org.ejercicios.examenPrueba.ejercicio16;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Ejercicio16 {

	public static void main(String[] args) {
		Locale locale = new Locale.Builder().setLanguage("it").setRegion("IT").build();
		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages",locale);
		Enumeration <String> keys = resourceBundle.getKeys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			String value = resourceBundle.getString(key);
			System.out.println(key + ":" + value);
		}

	}

}
/**
* OK
* Respuesta:
* A - no:NO yes:SI cancel: Cancel
*
*/