package com.pyramid;

public class A {

	public void starPattern(int lines) {

		for (int line = 1; line < lines; line++) {

			for (int space = lines-1; space > line; space--) {

				System.out.print(" ");
			}
			for (int ast = 1; ast <= line; ast++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
