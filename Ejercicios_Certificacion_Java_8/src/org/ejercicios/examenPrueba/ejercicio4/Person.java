package org.ejercicios.examenPrueba.ejercicio4;

public class Person {
	
	private String name;
	private Gender gender;
	
	public Person (String name, Gender gender){
		this.name = name;
		this.gender = gender;
	}
	
	
	public String getName() {
		return name;
	}


	public Gender getGender() {
		return gender;
	}


	public static boolean isFemale(Person person){
		return person.getGender().equals(Gender.FEMALE);
	}
	
	enum Gender{
		MALE,FEMALE
	}
	

}
