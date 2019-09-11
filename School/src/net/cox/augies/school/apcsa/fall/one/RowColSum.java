package net.cox.augies.school.apcsa.fall.one;

public class RowColSum {

	static double[][] rando = new double[6][6];
	static double rowsum1 = 0;
	static double colsum1 = 0;
	static double rowsum[] = new double[rando.length];
	static double colsum[] = new double[rando[0].length];

	public static void main(String[] args) {
		initializeArray();
		initializeSums();
		checkForInequality();
		printThing();
	}

	public static void initializeArray() {
		for (int i = 0; i < rando.length; i++) {
			for (int j = 0; j < rando[0].length; j++) {
				rando[i][j] = MyMath.randomWithRange(5, 7);
			}
		}
	}

	public static void initializeSums() {
		for (int i = 0; i < rando.length; i++) {
			for (int j = 0; j < rando[i].length; j++) {
				rowsum[i] += rando[i][j];
				colsum[j] += rando[i][j];
			}
		}
		for (int i = 0; i < rowsum.length; i++) {
//			System.out.println("Sum of row " + i + ": " + rowsum[i]);
			rowsum1 += rowsum[i];
		}
		System.out.println();
		for (int i = 0; i < colsum.length; i++) {
//			System.out.println("Sum of col " + i + ": " + colsum[i]);
			colsum1 += colsum[i];
		}
		// avoids inaccuracies in doubles' values.
		rowsum1 = Math.round(rowsum1 * 100000) / 100000;
		colsum1 = Math.round(colsum1 * 100000) / 100000;
	}

	public static void checkForInequality() {
		if (rowsum1 != colsum1) {
			System.out.println("ERROR: Total of all rows is not \nequal to total of all columns!");
			System.out.println("Total Row Sum: " + rowsum1);
			System.out.println("Total Col Sum: " + colsum1);
		}
	}

	public static void printThing() {
		for (int i = 0; i < rando.length; i++) {
			for (int j = 0; j < rando[i].length; j++) {
				System.out.print("  " + rando[i][j]);
			}
			System.out.println(" | " + rowsum[i]);
		}
		for (int i = 0; i < rando[0].length; i++) {
			System.out.print("-----");
		}
		System.out.println();
		for (int i = 0; i < rando[0].length; i++) {
			System.out.print(" " + colsum[i]);
		}
		System.out.println("\n");
		System.out.println("Total Row Sum: " + rowsum1);
		System.out.println("Total Col Sum: " + colsum1);
	}
}
