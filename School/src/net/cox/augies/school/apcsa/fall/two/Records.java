package net.cox.augies.school.apcsa.fall.two;

public class Records {
	public static void main(String[] args) {
		double[] height = new double[3];
		String[] names = new String[3];
		int[] age = new int[3];

		Person[][] medRecord = new Person[3][3]; // idk why the teacher made this 2D but okay.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				medRecord[i][j] = new Person(10, 4.5, "Joe");
				System.out.print(j + " of " + i + ": " + medRecord[i][j] + " ");
			}
			System.out.println();
		}
	}
}
