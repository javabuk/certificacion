package org.pruebas.examenA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ejercicio56 {

	public static void main(String[] args) {

		try{
			// A - Devuelve: report fy2014.txt
			//Stream<Path> files = Files.walk(Paths.get("D:\\report"));
			// B - Error de compilación
			//Stream<Path> files = Files.walk(Paths.get("D:\\report"), 3, (p, a) -> p.isRegularFile());
			// C - Error de compilación
			//Stream<Path> files = Files.find(Paths.get("D:\\report\\fy2014.txt"));
			// D - Error de compilación
			//Stream<Path> files = Files.walk(Paths.get("D:\\report"), 3, (p, a) -> a.isRegularFile());
			
			files.forEach(f -> System.out.println(f.getFileName()));
		}catch(IOException e){
			System.out.println(e);
		}

	}

}
