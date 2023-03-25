package method;

import java.util.Arrays;

public class Quiz01 {

	static void printnumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
		}
	}

	static void compare(int a, int b) {
		if (a > b)
			System.out.print(a);
		else
			System.out.print(b);
	}

	static void printarr(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {

		printnumber(5);
		System.out.println();
		compare(5, 6);
		System.out.println();

		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		printarr(arr);

	}

}
