package org.pruebas.examenA.ejercicio27;

import java.util.Locale;
import java.util.ResourceBundle;

public class Ejercicio27 {

	public void loadResourceBundle(){
		ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
		// D - CORRECTO (Error de compilación The method getObject(String) in the type ResourceBundle is not applicable for the arguments (int))
		//System.out.println(resource.getObject(1));
	}
	
	public static void main(String[] args) {
		new Ejercicio27().loadResourceBundle();

	}

}
