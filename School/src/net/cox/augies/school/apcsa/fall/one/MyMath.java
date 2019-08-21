package net.cox.augies.school.apcsa.fall.one;

/**
 * Build Own math class which has a min, max, abs, square, area of rectangle,
 * and perimeter
 * 
 * @author augies
 * 
 */
public class MyMath {
	public static void main(String[] args) {

	}

	/**
	 * Description - Finds the smallest of two doubles
	 * 
	 * @param a the first number
	 * @param b the second number
	 * @return the minimum number
	 */
	private static double min(double a, double b) {
		if (a > b) {
			return b;
		}
		return a;
	}

	/**
	 * Description - Finds the largest of two doubles
	 * 
	 * @param a the first number
	 * @param b the second number
	 * @return the maximum number
	 */
	private static double max(double a, double b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	/**
	 * Description - finds the absolute value of a double
	 * 
	 * @param a the double to have its absolute value found
	 * @return the absolute value
	 */
	private static double abs(double a) {
		if (a < 0) {
			a *= -1;
		}
		return a;
	}

	/**
	 * Description - squares a double
	 * 
	 * @param a the double to be squared
	 * @return the squared double
	 */
	private static double square(double a) {
		return a * a;
	}

	/**
	 * Description - cubes a double
	 * 
	 * @param a the double to be cubed
	 * @return the cubed double
	 */
	private static double cube(double a) {
		return a * a * a;
	}

	/**
	 * Description - finds the area of a rectangle
	 * 
	 * @param a the length
	 * @param b the width
	 * @return the area of the rectangle
	 */
	private static double areaRect(double a, double b) {
		if (a <= 0 || b <= 0) {
			System.out.println("ERROR: Each side must be a positive number!");
			return -1;
		}
		return a * b;
	}

	/**
	 * Description - Finds the perimeter of a rectangle
	 * 
	 * @param a the length
	 * @param b the width
	 * @return the perimeter of a rectangle
	 */
	private static double perimeterRect(double a, double b) {
		if (a <= 0 || b <= 0) {
			System.out.println("ERROR: Each side must be a positive number!");
			return -1;
		}
		return 2 * a + 2 * b;
	}

	/**
	 * Description - Finds the circumference of a circle
	 * 
	 * @param a the radius of the circle
	 * @return the circumference of the circle
	 */
	private static double circumference(double a) {
		return 3.14 * a * 2;
	}

	/**
	 * Description - Finds the area of a circle
	 * 
	 * @param a the radius of the circle
	 * @return the area of the circle
	 */
	private static double areaCircle(double a) {
		return 3.14 * square(a);
	}

	/**
	 * Description - Finds a random number given an upper and lower bound
	 * 
	 * @param a the lower bound (inclusive)
	 * @param b the upper bound (inclusive)
	 * @return the random number generated
	 */
	private static int randomWithRange(double a, double b) {
		return (int) (roundDown(Math.random() * (b - a + 1)) + a);
	}

	/**
	 * Description - Performs a ceiling function on a number
	 * 
	 * @param a the number to be rounded
	 * @return the rounded number
	 */
	private static int roundUp(double a) {
		if (a % 1 == 0) {
			return (int) a;
		}
		return ((int) a) + 1;
	}

	/**
	 * Description - Performs a floor function on a number
	 * 
	 * @param a the number to be rounded
	 * @return the rounded number
	 */
	private static int roundDown(double a) {
		return (int) a;
	}
}
