package org.pruebas.examenA.ejercicio24;

import java.util.concurrent.RecursiveTask;

// A - No compila
//public class MyTask extends RecursiveAction<Integer> {
public class MyTask extends RecursiveTask<Integer> {

	final int low; final int high;
	static final int THRESOLD = 1;
	
	MyTask(int low, int high ){
		this.low = low; this.high = high;
	}
	
	Integer computeDirectly() {
		
		return 0;
	}
	
	@Override
	protected Integer compute() {
		if (high - low <= THRESOLD)
			return computeDirectly();
		int mid = low + high /2;
		invokeAll(new MyTask(low,mid), new MyTask(mid,high));
		// C -The compute() method must be changed to return an Integer result.
		return mid;
	}

}
