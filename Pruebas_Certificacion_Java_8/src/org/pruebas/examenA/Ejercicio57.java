package org.pruebas.examenA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio57 {

	public static void main(String[] args) {
		//A - Error de compilación (Type mismatch: cannot convert from HashMap<String,ArrayList<String>> to Map<String,List<String>>)
		//Map<String, List<String>> category = new HashMap<String, ArrayList<String>>();
		//B - Error de compilación (Incorrect number of arguments for type HashMap<K,V>; it cannot be parameterized with arguments ) 
		//Map<String, List<String>> category = new HashMap<List>();
		//C - Error de compilación (Syntax error on token(s), misplaced construct(s))
		//Map<String, List<String>> category = new HashMap<<,List>>();
		//D - CORRECTO
		//Map<String, List<String>> category = new HashMap<>();
		//E - CORRECTO 
		Map<String, List<String>> category = new HashMap<String, List<String>>();
		//F - Error de compilación ( Type mismatch: cannot convert from HashMap<String,List<?>> to Map<String,List<String>>)
		//Map<String, List<String>> category = new HashMap<String, List <>>();
		
		List fontCatalog = new ArrayList();
		
		fontCatalog.add("Algerian");
		fontCatalog.add("Cambria");
		fontCatalog.add("Lucia Bright");
		category.put("firstCategory", fontCatalog);
	}

}
