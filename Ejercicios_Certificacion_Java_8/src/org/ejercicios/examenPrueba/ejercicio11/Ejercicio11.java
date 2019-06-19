package org.ejercicios.examenPrueba.ejercicio11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ejercicio11 {

	public static void main(String[] args) throws IOException {

		//OpenOption[] options = new OpenOption[]{StandardOpenOption.WRITE, StandardOpenOption.READ}; // A - Exception READ not allowed
		//OpenOption[] options = new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.WRITE}; // B - 
		//OpenOption[] options = new OpenOption[]{StandardOpenOption.PREPEND, StandardOpenOption.WRITE}; // C -
		//OpenOption[] options = new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.SYNC}; // D -
		OpenOption[] options = new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.TRUNCATE_EXISTING}; // E - java.lang.IllegalArgumentException: APPEND + TRUNCATE_EXISTING not allowed
		Files.write(Paths.get("C:\\Users\\Jorge\\Git\\certificacion\\Ejercicios_Certificacion_Java_8\\src\\org\\ejercicios\\examenPrueba\\ejercicio11\\file.txt"), "abc".getBytes(), options);

	}

}
/**
* OK
* Respuesta B,D
*
*/