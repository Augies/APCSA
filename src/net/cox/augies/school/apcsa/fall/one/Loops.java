package net.cox.augies.school.apcsa.fall.one;

public class Loops {
	public static void main(String[] args) {
		int x = 0;
		while (x < 10) {
			x++;
		}
		System.out.println(x);
	}

	public static int myWhileLoop(int x) {
		if (x < 10) {
			return myWhileLoop(x + 1);
		}
		return x;
	}

	public static int myForLoop(int start, int stop) {
		if (start > stop) {
			return 502;
		}
		while (start < stop) {
			return myForLoop(start + 1, stop);
		}
		return 200;
	}

}
