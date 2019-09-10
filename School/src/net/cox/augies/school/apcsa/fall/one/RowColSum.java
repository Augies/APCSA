package net.cox.augies.school.apcsa.fall.one;

public class RowColSum {

	static double rowsum1 = 0;
	static double colsum1 = 0;

	public static void main(String[] args) {
		double[][] rando = new double[4][6];
		for (int i = 0; i < rando.length; i++) {
			for (int j = 0; j < rando[0].length; j++) {
				rando[i][j] = (double) Math.random();
			}
		}
		printSums(rando);
		checkForInequality();
	}

	public static void printSums(double[][] arr) {
		double[] rowsum = new double[arr.length];
		double[] colsum = new double[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rowsum[i] += arr[i][j];
				colsum[j] += arr[i][j];
			}
		}
		for (int i = 0; i < rowsum.length; i++) {
			System.out.println("Sum of row " + i + ": " + rowsum[i]);
			rowsum1 += rowsum[i];
		}
		System.out.println();
		for (int i = 0; i < colsum.length; i++) {
			System.out.println("Sum of col " + i + ": " + colsum[i]);
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
}
