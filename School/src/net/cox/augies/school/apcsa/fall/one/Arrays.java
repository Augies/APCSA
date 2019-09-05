package net.cox.augies.school.apcsa.fall.one;

public class Arrays {
	// container for tons of variables of same data type
	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 3;
		x[1] = 90;
		x[2] = -9;
		x[3] = 45;
		x[4] = -11;
		int[] y = { 1, 2, 3, 4, 5 };
		System.out.println(y[0]);// prints 1
		String[] ids = new String[100];
		for (int i = 0; i < ids.length; i++) {// iterates through whole array
			ids[i] += (i + 111);
		}
		for (String i : ids) {
			System.out.println(i);// prints every id
			i = i.concat("hi");
		}

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}

		int[] arr1 = new int[10];
		for (int i = 0; i < 10; i++) {
			if (i > 7 || i < 3) {
				arr1[i] = arr1[i] + (i % 5);
			}
			System.out.println(arr1[i]);
		}
	}
}
