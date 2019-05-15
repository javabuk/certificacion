package org.pruebas.examenA;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio15 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try ( 
				FileReader fr = new FileReader("logfilesrc.txt");
				FileWriter fw = new FileWriter("logfiledest.txt")
				){
			Class c = Class.forName("java.lang.JString");
		}

	}

}
