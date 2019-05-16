package org.pruebas.examenA;

public class Ejercicio42 {

	void display(String [] arr){
		try{
			System.out.println(arr[2]);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e){
			e = new Exception();
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try{
			String [] arr = { "Unix", "Solaris", null};
		}catch(Exception e){
			System.out.println(e.getClass());
		}
	}

}
