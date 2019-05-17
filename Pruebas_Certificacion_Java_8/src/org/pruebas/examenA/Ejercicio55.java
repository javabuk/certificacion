package org.pruebas.examenA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Ejercicio55 {

	public static void main(String[] args) throws IOException  {

		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home"))); 
		files.forEach( fName -> {
			try{
				Path aPath = fName.toAbsolutePath();
				System.out.println(fName + ": "
						+ Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
			}catch (IOException ex){
				ex.printStackTrace();
			}
		}
				
				
				);
		
		
	}

}
