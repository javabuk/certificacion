package org.ejercicios.examenPrueba.ejercicio21;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Staff {
	
	private Map<String, Double> salaries = new HashMap<String, Double>();
	private ReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void setSalary (String name, double salary){
		// Acquires lock
		try{
			salaries.put(name, salary);
		}finally{
			// Releases lock
		}
	}
	
	public double getAverageSalary(){
		double total = 0.0;
		// 1
		//lock.writeLock().acquired() // A - No compila
		//lock.writeLock().lock(); // B - No es válido
		//lock.acquire() // C - No compila
		lock.readLock().lock(); // D
		
		try{
			for(double d:salaries.values()){
				total += d;
			}
		}finally{
			//2
			//lock.writeLock().release() // A - No compila
			//lock.writeLock().unlock();  // B - No es válido
			//lock.release(); // C - No compila
			lock.readLock().unlock(); // D
		}
		return total/salaries.size();
	}

}
/**
* OK
* Resultado: D
*
*/