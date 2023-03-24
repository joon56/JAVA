package loop;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int mul = 1;
		
		while (mul <= 9) {
			System.out.printf("2 * %d = %d", mul, mul * 2);
			mul++;
		}
		
		
		
		System.out.print("ют╥б : ");
		mul = sc.nextInt();
		int total = mul * 2;
		System.out.println(total);
		
		
		
		mul = 9;
		
		while (mul >= 1) {
			System.out.printf("2 * %d = %d", mul, mul * 2);
			mul--;
		}
		
		sc.close();
	}

}
