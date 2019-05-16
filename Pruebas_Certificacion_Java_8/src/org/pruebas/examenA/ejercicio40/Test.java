package org.pruebas.examenA.ejercicio40;

import java.util.List;

public class Test {
	
	List<String> list = null;
	public void printValues(){
		System.out.println(getList());
	}
	
	public List<String> getList() { return list; }

	public void setList(List<String> newList){list=newList;}
	
}
