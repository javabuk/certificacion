package org.ejercicios.libro.file.ej03;

import java.nio.file.*;

public class Finder {
	public void findHiddenFile(Path p) throws Exception {
		if (File.isHidden(p)) {
			System.out.print("Found!");
		}
	}

	public static void main(String[] folders) throws Exception {
		final Finder f = new Finder();
		f.findHiddenFile(Paths.get("/secret/hide.txt"));
	}
}
/*
* Respuesta:
* A - The class does not compile.
*/