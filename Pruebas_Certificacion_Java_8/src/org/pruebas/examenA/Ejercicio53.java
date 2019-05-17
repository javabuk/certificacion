package org.pruebas.examenA;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Ejercicio53 {

	public static void main(String[] args) throws InterruptedException {
		// Login time: 2015-01-12T21:58:18.817Z
		Instant loginTime = Instant.now();
		Thread.sleep(1000);
		
		// Logout time:
		Instant logoutTime = Instant.now();
		
		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
		
		if(logoutTime.isAfter(loginTime))
			System.out.println("Logged out at: " + logoutTime);
		else
			System.out.println("Can't logout");
	}

}
