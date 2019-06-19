package org.ejercicios.examenPrueba.ejercicio7;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

public class Ejercicio7 {

	public static void main(String[] args) {
		PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**.{xml,json}");	//A	
		//PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("regex:**.{xml,json}"); //B
		//PathMatcher pathMatcher = new PathMatcher("glob:**.{xml,json}"); //C
		//PathMatcher pathMatcher = new PathMatcher("regex:**.{xml,json}"); //D

	}

}
/**
 * OK
 * Respuesta:
 * A 
 * la C,D no compilan y la B da un error en tiempo de ejecución
 * Exception in thread "main" java.util.regex.PatternSyntaxException: Dangling meta character '*' near index 0
**.{xml,json}
^
 * 
 */
