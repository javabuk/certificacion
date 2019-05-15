package org.pruebas.examenA;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		/*Vehicle v = new Vehicle(){
			public void ride(int speed){
				System.out.println("Fly at " + speed);
			}
		};*/
		// A - Error de compilaci�n
		// Vehicle v = new Vehicle(int speed) { System.out.print(�Fly at � + speed); );
		// B - Error de compilaci�n
		// Vehicle v = int speed -> System.out.print("Fly at " + speed);
		// C - Opcion correcta
		Vehicle v = (int speed) -> System.out.print("Fly at " + speed);
		// D - Error de compilaci�n
		//Vehicle v = speed -> {System.out.print("Fly at " + speed) };
		v.ride(100);
	}

}
