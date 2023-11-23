package com.isPrime;

public class A {
	
	/**
	 * This method specified whether the specified element is prime or not
	 * @param num
	 * @return true if the specified element is prime
	 */
	
	public boolean isPrime(int num) {
		
		boolean isPrime = false;
		int count = 0;

		for (int i = 1; i < num; i++) {
			
			if (num % i == 0)
				count++;
			
			if (count > 2)
				break;
		}
		if (count <= 2)
			return true;
		else
			return false;
	}

}
