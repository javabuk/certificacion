package org.pruebas.examenA.ejercicio35;

import java.io.IOException;

public class Ejercicio35 {

	public static void main(String[] args) {
		try (CustomerResource res = new  CustomerResource("prueba")){
			
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}
