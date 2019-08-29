package net.cox.augies.school.apcsa.fall.one;

public class DiamondProject {

	public static void main(String[] args) {
		diamond(0);
		diamond(1);
		diamond(2);
	}

	/**
	 * 
	 * @param size the size of the diamond 0 is 3x3, 1 is 5x5, etc
	 */
	public static void diamond(int size) {
		for (int y = (size * -1) - 1; y < size + 2; y++) {
			for (int x = (size * -1) - 1; x < size + 2; x++) {
				switch (getQuadrant(x, y)) {
				case 1:
					if (isSlash(size, x, y)) {
						System.out.print("/");
					} else {
						System.out.print(" ");
					}
					break;
				case 2:
					if (isSlash(size, x, y)) {
						System.out.print("\\");
					} else {
						System.out.print(" ");
					}
					break;
				case 3:
					if (isSlash(size, x, y)) {
						System.out.print("/");
					} else {
						System.out.print(" ");
					}
					break;
				case 4:
					if (isSlash(size, x, y)) {
						System.out.print("\\");
					} else {
						System.out.print(" ");
					}
					break;
				default:
					switch (getMax(size, x)) {
					case -1:
						System.out.print("<");
						break;
					case 1:
						System.out.print(">");
						break;
					default:
						switch (getMax(size, y)) {
						case -1:
							System.out.print("^");
							break;
						case 1:
							System.out.print("V");
							break;
						default:
							if (x == 0) {
								if (y == 0) {
									System.out.print("+");
								} else {
									System.out.print("|");
								}
							} else if (y == 0) {
								System.out.print("-");
							}
							break;
						}
						break;
					}
					break;
				}
			}
			System.out.print("\n");
		}
	}

	/**
	 * Finds the quadrant of a coordinate pair. If on an axis or origin, returns 0
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return the quadrant of the coordinate pair
	 */
	public static int getQuadrant(int x, int y) {
		if (y == 0) {
			return 0;
		}
		if (x < 0) {
			if (y < 0) {
				return 3;
			}
			return 2;
		}
		if (x > 0) {
			if (y < 0) {
				return 4;
			}
			return 1;
		}
		return 0;
	}

	public static int getMax(int size, int x) {
		size++;
		if (x == size) {
			return 1;
		}
		if (x == size * -1) {
			return -1;
		}
		return 0;
	}

	public static boolean isSlash(int size, int x, int y) {
		size++;
		y = Math.abs(y);
		x = Math.abs(x);
		if (x + y == size) {
			return true;
		}
		return false;
	}
}
