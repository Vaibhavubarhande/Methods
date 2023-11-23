package com.Even;

public class A {

	public boolean isEven(int num) {

		int count = 0;

		if (num % 2 == 0) {

			count++;
		}

		if (count >= 1)
			return true;
		else
			return false;
	}
}
