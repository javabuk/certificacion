package org.pruebas.examenA.ejercicio25;

public class Vehicle {
	
	int vID;
	String vName;
	public Vehicle(int vIdArg, String vNameArg) {		
		this.vID = vIdArg;
		this.vName = vNameArg;
	}
	public int getvID() {
		return vID;
	}
	public String getvName() {
		return vName;
	}
	@Override
	public String toString() {
		return vName;
	}
	
	
	

}
