package net.cox.augies.school.apcsa.fall.two.tictactoe;

import java.util.Scanner;

import net.cox.augies.school.apcsa.fall.one.MyMath;

public class TicTacToe {
	static Scanner scInt = new Scanner(System.in);

	static TTTGridSpace[][] grid;

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic-Tac-Toe Game!");
		System.out.print("Please enter the grid size: ");
		int size = scInt.nextInt();
		initializeGrid(size);
		int xSelect = 0;
		int ySelect = 0;
		while (!(isXWin() || isOWin() || isFull())) {
			printGrid();
			System.out.print("\nEnter X: ");
			xSelect = scInt.nextInt() - 1;
			System.out.print("\nEnter Y: ");
			ySelect = scInt.nextInt() - 1;
			playerMove(xSelect, ySelect);
			botMove();
		}
		if (isXWin()) {
			System.out.println("Congrats! You won!");
		} else if (isOWin()) {
			System.out.println("Uh oh! The bot won!");
		} else {
			System.out.println("Nobody Won. Sad.");
		}
	}

	public static void initializeGrid(int size) {
		grid = new TTTGridSpace[size][size];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = new TTTGridSpace(0);
			}
		}
	}

	public static void playerMove(int x, int y) {
		if (isValidPlace(x, y)) {
			grid[y][x].setX(true);
			grid[y][x].setBlank(false);
		} else {
			System.out.println("Error: Invalid move!");
		}
	}

	public static void printGrid() {
//		for (int i = 0; i < grid.length; i++) {
//			System.out.print("--");
//		}
//		System.out.println("--");
		for (int i = 0; i < grid.length; i++) {
			System.out.print("|");
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
//		for (int i = 0; i < grid.length; i++) {
//			System.out.print("--");
//		}
//		System.out.println("--");
	}

	public static boolean isValidPlace(int x, int y) {
		if (x >= grid[0].length) {
			System.out.println("Invalid Move! X is Too Big!");
			return false;
		}
		if (y >= grid.length) {
			System.out.println("Invalid Move! Y is Too Big!");
			return false;
		}
		if (grid[y][x].isO()) {
			return false;
		}
		if (grid[y][x].isX()) {
			return false;
		}
		return true;
	}

	public static void botMove() {
		if (!isFull()) {
			int randX = MyMath.randomWithRange(0, grid.length - 1);
			int randY = MyMath.randomWithRange(0, grid.length - 1);
			while (!isValidPlace(randX, randY)) {
				randX = MyMath.randomWithRange(0, grid.length - 1);
				randY = MyMath.randomWithRange(0, grid.length - 1);
			}
			grid[randY][randX].setO(true);
			grid[randY][randX].setBlank(false);
		} else {
			System.out.println("Nobody Won. Sad.");
		}
	}

	public static boolean isWin(String choice) {
		choice = choice.toLowerCase();
		switch (choice) {
		case "x":
			return isXWin();
		case "o":
			return isOWin();
		default:
			System.out.println("Cannot check win for a non-x or non-o!");
			return false;
		}
	}

	public static boolean isXWin() {
		// diagonals
		int countDiag = 0;
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][i].isX()) {
				countDiag++;
			}
		}
		if (countDiag == grid.length) {
			return true;
		}
		countDiag = 0;
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][grid.length - 1 - i].isX()) {
				countDiag++;
			}
		}
		if (countDiag == grid.length) {
			return true;
		}

		// horizontals
		for (int i = 0; i < grid.length; i++) {
			int countHoriz = 0;
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].isX()) {
					countHoriz++;
				}
			}
			if (countHoriz == grid.length) {
				return true;
			}
		}

		// verticals
		for (int i = 0; i < grid.length; i++) {
			int countVert = 0;
			for (int j = 0; j < grid.length; j++) {
				if (grid[j][i].isX()) {
					countVert++;
				}
			}
			if (countVert == grid.length) {
				return true;
			}
		}

		return false;
	}

	public static boolean isOWin() {
		// diagonals
		int countDiag = 0;
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][i].isO()) {
				countDiag++;
			}
		}
		if (countDiag == grid.length) {
			return true;
		}
		countDiag = 0;
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][grid.length - 1 - i].isO()) {
				countDiag++;
			}
		}
		if (countDiag == grid.length) {
			return true;
		}

		// horizontals
		for (int i = 0; i < grid.length; i++) {
			int countHoriz = 0;
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].isO()) {
					countHoriz++;
				}
			}
			if (countHoriz == grid.length) {
				return true;
			}
		}

		// verticals
		for (int i = 0; i < grid.length; i++) {
			int countVert = 0;
			for (int j = 0; j < grid.length; j++) {
				if (grid[j][i].isO()) {
					countVert++;
				}
			}
			if (countVert == grid.length) {
				return true;
			}
		}

		return false;
	}

	public static boolean isFull() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].isBlank()) {
					return false;
				}
			}
		}
		return true;
	}
}
