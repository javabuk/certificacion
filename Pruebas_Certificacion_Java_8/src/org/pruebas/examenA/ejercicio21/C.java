package org.pruebas.examenA.ejercicio21;

import java.util.concurrent.Callable;

public class C implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "Call..";
	}

}
