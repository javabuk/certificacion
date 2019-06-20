package org.ejercicios.examenPrueba.ejercicio17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio17 {

	public static void main(String[] args) throws IOException {

		// Path path = Paths.get("C:\\Users\\Jorge\\Git\\certificacion\\Ejercicios_Certificacion_Java_8\\src\\org\\ejercicios\\examenPrueba\\ejercicio17\\file.txt");	System.out.println(Files.readAttributes(path, "length")); // Exception "length" no reconocido
		Path path = Paths.get("C:\\Users\\Jorge\\Git\\certificacion\\Ejercicios_Certificacion_Java_8\\src\\org\\ejercicios\\examenPrueba\\ejercicio17\\file.txt");	System.out.println(Files.readAttributes(path, "size")); // OK
		//File file = new File("C:\\Users\\Jorge\\Git\\certificacion\\Ejercicios_Certificacion_Java_8\\src\\org\\ejercicios\\examenPrueba\\ejercicio17\\file.txt"); System.out.println(Files.readAttributes(file, "length")); // Error de compilación
		//File file = new File("C:\\Users\\Jorge\\Git\\certificacion\\Ejercicios_Certificacion_Java_8\\src\\org\\ejercicios\\examenPrueba\\ejercicio17\\file.txt"); System.out.println(Files.getAttribute(file, "size")); // Error de compilación
		

	}

}
/**
 * OK
 * Respuesta: B 
 *
 * 
 */
