package org.ejercicios.libro.concurrencia.ej02;

import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class TicketTaker {
	long ticketsSold;
	final AtomicInteger ticketsTaken;

	public TicketTaker() {
		ticketsSold = 0;
		ticketsTaken = new AtomicInteger(0);
	}

	public void performJob() {
		IntStream.iterate(1, p -> p + 1).parallel().limit(10).forEach(i -> ticketsTaken.getAndIncrement());
		IntStream.iterate(1, q -> q + 1).limit(5).parallel().forEach(i -> ++ticketsSold);
		System.out.print(ticketsTaken + " " + ticketsSold);
	}

	public static void main(String[] matinee) {
		new TicketTaker().performJob();
	}
}
/*
 * Respuesta:
 * C - I,II and III
 */
