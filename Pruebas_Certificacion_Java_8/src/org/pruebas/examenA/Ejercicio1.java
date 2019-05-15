package org.pruebas.examenA;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio1 {

	public static void main(String[] args) {
		//IntStream str = Stream.of(1, 2, 3, 4)
		//DoubleStream str = Stream.of(1.0, 2.0, 3.0, 4.0);
		/*Stream str = Stream.of(1, 2, 3, 4);
		str.average()*/
		IntStream str = IntStream.of(1, 2, 3, 4);
		str.average().getAsDouble();
	}

}
