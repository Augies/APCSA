package net.cox.augies.school.apcsa.fall.one;

public class PlusOneCalculator {
	public static void main(String[] args) {
		System.out.println("4 + 6 = " + plus(4, 6, 0));
	}

	static int plus(int one, int two, int three) {// three is placeholder value
		if (two != three) {
			return plus(one + 1, two, three + 1);
		}
		return one;
	}
}
