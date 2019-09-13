package net.cox.augies.school.apcsa.fall.one;

import java.util.Scanner;

public class ColVsRow {
	static Scanner scInt = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please Enter the number of Rows");
		int rnum = scInt.nextInt();
		System.out.println("Please Enter the number of Columns");
		int cnum = scInt.nextInt();
		String[][] words = new String[rnum][cnum];

		for (int row = 0; row < words.length; row++) {
			for (int col = 0; col < words[row].length; col++) {
				words[row][col] = "" + (char) (97 + (row * words[row].length) + (col));
				System.out.print(words[row][col] + " ");
			}
			System.out.println();
		}
	}
}
