package org.ejercicios.libro.exceptions.ej13;

public class SpellChecker {
	public final static void main(String... participants) {
		try {
			if (!"cat".equals("kat")) {
				new SpellingException();
			}
		} catch (SpellingException | NullPointerException e) {
			System.out.println("Spelling problem!");
		} catch (Exception e) {
			System.out.println("Unknown Problem!");
		} finally {
			System.out.println("Done!");
		}
	}

}
/*
 * Respuesta:
 * A - One
 * 
 */
