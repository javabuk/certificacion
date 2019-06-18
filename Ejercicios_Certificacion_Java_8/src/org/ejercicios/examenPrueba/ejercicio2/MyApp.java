package org.ejercicios.examenPrueba.ejercicio2;

public class MyApp {

	public static void main(String[] args) {
		
		try (MyResource resource = new MyResource()){
			throw new RuntimeException();
		}catch (Exception e){
			System.out.print("exception ");
			for(Throwable throwable : e.getSuppressed()){
				System.out.print(throwable.getClass().getName());
			}
		}

	}

}

/**
 * OK
 * Respuesta:
 * A - resource exception java.io.IOException
 * 
 * 
 * 
 */
