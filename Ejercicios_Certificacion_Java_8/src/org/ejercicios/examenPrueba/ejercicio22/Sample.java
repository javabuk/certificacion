package org.ejercicios.examenPrueba.ejercicio22;
// A - Correcta
public interface Sample<E> {
	
	E getSomething();
	
	default void setSomething (E e){};

}


/*
 * B - No compila
@FunctionalInterface
public interface Sample<E> {
	default void setSomething (){};
}
*/

/*
 * C - No compila
public interface Sample<E> {
	
	E getSomething();
	
	void setSomething (E e)

}
*/

/*
 * D - No compila
@FunctionalInterface
public interface Sample<E> {
	abstract E getSomething();
	abstract void setSomething ();
}
*/