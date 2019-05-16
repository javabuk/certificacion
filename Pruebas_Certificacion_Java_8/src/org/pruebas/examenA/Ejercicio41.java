package org.pruebas.examenA;

public class Ejercicio41 {

	public static void main(String[] args) {

		try{
			doStuff();
		//}catch ( ArithmeticException | NumberFormatException | Exception e){
		// C - Error de compilación
		//}catch (  Exception |ArithmeticException | NumberFormatException  e){
		//}catch ( ArithmeticException | NumberFormatException e){
		// B - Correcto
		}catch ( ArithmeticException | NumberFormatException e){
			System.out.println(e.getMessage());
			// A - Error de compilación
			//throw e;
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		// D - Error de compilación
		
	}
	
	static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
		if (Math.random() > -1) throw new Exception("Try again");
	}

}
