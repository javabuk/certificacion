package org.pruebas.examenA;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio60 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("/Pics/MyPic.jpeg");
		System.out.println(p1.getNameCount() +
				":" + p1.getName(1) +
				":" + p1.getFileName());

	}

}
