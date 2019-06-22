package org.ejercicios.libro.exceptions.ej3;

public class Ball {
	public void toss() throw LostBallException {
		throw new ArrayStoreException();
	}

	public static void main(String[] bouncy) {
		try {
			new Ball().toss();
		} catch (Throwable e) {
			System.out.print("Caught!");
		}
	}
}
/**
* 
*/

