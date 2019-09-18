package net.cox.augies.school.apcsa.fall.two;

import java.util.Scanner;

import net.cox.augies.school.apcsa.fall.one.MyMath;

/**
 * User enters a maze and can move (WASD) through maze If finds treasure, print
 * Win If Out-of-Bounds or block, print re-enter
 * 
 * @author augies
 *
 */
public class Maze {

	static MazeTile[][] maze = new MazeTile[10][10];
	static Scanner sc = new Scanner(System.in);
	static int posX = 0;
	static int posY = 0;
	static String command;

	public static void main(String[] args) {
		System.out.println("****MAZE GAME****");
		System.out.println("Controls:");
		System.out.println("-W for Up");
		System.out.println("-A for Left");
		System.out.println("-S for Down");
		System.out.println("-D for Right");

		initializeMaze();

		printMaze();
		System.out.println("Enter a command: ");
		command = sc.nextLine();
		move(command);
		while (!maze[posY][posX].isTreasure()) {
			printMaze();
			System.out.println("Move again");
			System.out.println("Enter a command: ");
			move(sc.nextLine());
		}
		System.out.println("Landed on a treasure. You won!");
	}

	public static void initializeMaze() {
		int randX = 0;
		int randY = 0;
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				if (Math.abs(i - j) < 1 || Math.abs(i + 1 - j) < 1) {
					maze[i][j] = new MazeTile(false, false);
				} else {
					maze[i][j] = new MazeTile(false, false);
				}
			}
		}
		for (int i = 0; i < Math.min(Math.min(maze.length, maze[0].length) - 1, 6); i++) {
			randX = MyMath.randomWithRange(0, maze[0].length - 1);
			randY = MyMath.randomWithRange(0, maze.length - 1);
			maze[randY][randX] = new MazeTile(false, true);
		}
		while (!canPlaceTreasure(randX, randY)) {
			randX = MyMath.randomWithRange(0, maze[0].length - 1);
			randY = MyMath.randomWithRange(0, maze.length - 1);
		}
		maze[randY][randX] = new MazeTile(true, false);
	}

	public static void printMaze() {
		System.out.println();
		for (int i = 0; i < maze[0].length; i++) {
			System.out.print("---");
		}
		System.out.println("--");
		for (int i = 0; i < maze.length; i++) {
			System.out.print("|");
			for (int j = 0; j < maze[i].length; j++) {
				if (posX == j && posY == i) {
					System.out.print(": )");
				} else {
					System.out.print(maze[i][j]);
				}
			}
			System.out.println("|");
		}
		for (int i = 0; i < maze[0].length; i++) {
			System.out.print("---");
		}
		System.out.println("--");
	}

	public static void move(String move) {
		if (!(move.equalsIgnoreCase("w") || move.equalsIgnoreCase("a") || move.equalsIgnoreCase("s")
				|| move.equalsIgnoreCase("d"))) {
			System.out.println("Error. Incorrect Movement");
		} else {
			tryMove(move.toLowerCase());
		}
	}

	public static void tryMove(String move) {
		switch (move) {
		case "w":
			tryMoveUp();
			break;
		case "a":
			tryMoveLeft();
			break;
		case "s":
			tryMoveDown();
			break;
		case "d":
			tryMoveRight();
			break;
		default:
			System.out.println("Error. Tried to move without WASD");
			break;
		}
	}

	public static void tryMoveUp() {
		if (isOnTopBorder(posY)) {
//			System.out.println("Error. Cannot move Up!");
			if (maze[maze.length - 1][posX].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posY = maze.length - 1;
			}
		} else {
			if (maze[posY - 1][posX].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posY--;
			}
		}
	}

	public static void tryMoveDown() {
		if (isOnBottomBorder(posY)) {
//			System.out.println("Error. Cannot move Down!");
			if (maze[0][posX].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posY = 0;
			}
		} else {
			if (maze[posY + 1][posX].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posY++;
			}
		}
	}

	public static void tryMoveLeft() {
		if (isOnLeftBorder(posX)) {
			if (maze[posY][maze[0].length - 1].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posX = maze[0].length - 1;
			}
		} else {
			if (maze[posY][posX - 1].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posX--;
			}
		}
	}

	public static void tryMoveRight() {
		if (isOnRightBorder(posX)) {
			if (maze[posY][0].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posX = 0;
			}
		} else {
			if (maze[posY][posX + 1].isBlocked()) {
				System.out.println("It's Blocked!");
			} else {
				posX++;
			}
		}
	}

	public static boolean isOnRightBorder(int x) {
		if (x == maze[0].length - 1) {
			return true;
		}
		return false;
	}

	public static boolean isOnLeftBorder(int x) {
		if (x == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOnTopBorder(int y) {
		if (y == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOnBottomBorder(int y) {
		if (y == maze.length - 1) {
			return true;
		}
		return false;
	}

	public static boolean isOnBorder(int x, int y) {
		if (isOnRightBorder(x) || isOnLeftBorder(x) || isOnTopBorder(y) || isOnBottomBorder(y)) {
			return true;
		}
		return false;
	}

	public static boolean canPlaceTreasure(int x, int y) {
		y += maze.length;
		x += maze[0].length;
		if (maze[((y - 1) % maze.length)][x % maze[0].length].isBlocked()) {
			if (maze[(y + 1) % maze.length][x % maze[0].length].isBlocked()) {
				if (maze[y % maze.length][(x - 1) % maze[0].length].isBlocked()) {
					if (maze[y % maze.length][(x + 1) % maze[0].length].isBlocked()) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
