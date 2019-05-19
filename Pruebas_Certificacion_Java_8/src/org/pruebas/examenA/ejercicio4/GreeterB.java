package org.pruebas.examenA.ejercicio4;

public interface GreeterB {
	
	public default String greet(String name){
		return name;
	}
	
	public String greet(String name, String salute);

}
