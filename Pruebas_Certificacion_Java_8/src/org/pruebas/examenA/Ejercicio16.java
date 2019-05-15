package org.pruebas.examenA;

public class Ejercicio16 {

	public static void main(String[] args) {
		String var = args.length == 1?args[0]: "Kava";
		switch (var.replace('v', 'w')) {
		case "kava":
			System.out.println("kava");
			break;
		case "Kava":
			System.out.println("Kava");
			break;
		case "kawa":
			System.out.println("kawa");
			break;
		case "Kawa":
			System.out.println("Kawa");
			break;			
		}

	}

}
