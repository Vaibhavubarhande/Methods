package com.practice;

public class A {

	public boolean isPalindrome(int num) {

		int x = num;
		int rem = 0;
		int rev = 0;

		while (x > 0) {

			rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;
		}

		if (rev == num)
			return true;
		else
			return false;
	}
}
