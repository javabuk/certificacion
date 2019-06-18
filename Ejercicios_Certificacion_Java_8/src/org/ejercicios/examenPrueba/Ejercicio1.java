package org.ejercicios.examenPrueba;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ejercicio1 {

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\Users\\Jorge\\Git\\certificacion\\Ejercicios_Certificacion_Java_8\\src\\org\\ejercicios\\examenPrueba\\file1.txt");
		Path p2 = Paths.get("C:\\Users\\Jorge\\Git\\certificacion\\Ejercicios_Certificacion_Java_8\\src\\org\\ejercicios\\examenPrueba\\file2.txt");
		try {
			Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
/**
 * OK
 * Respuecta correcta: 
 * B- An exception is thrown at runtime
 * 
 * Cuando hacemos un copy y el fichero de destino ya existe es necesario pasar la opción REPLACE_EXISTING al método copy sino lanza una excepción FileAlreadyExistsException
 * 
 */
