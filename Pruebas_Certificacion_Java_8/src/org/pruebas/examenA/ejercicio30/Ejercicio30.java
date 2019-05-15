package org.pruebas.examenA.ejercicio30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio30 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader (new FileReader("salesreport.dat"))) {
			String record;
			while ( (record = br.readLine()) != null ){
				System.out.println(record);
			}
			br.close();
			// D - CORRECTO
			br = new BufferedReader( new FileReader("annualreport.dat"));
			while ((record=br.readLine()) != null){
				System.out.println(record);
			}
		}catch(IOException e){
			System.err.print(e.getClass());
		}

	}

}
