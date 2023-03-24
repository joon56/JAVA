package loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		// ---------------------------------------------
		
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		int n2 = 1;
		
		while (n2 < n + 1) {
			System.out.println(n2);
			n2++;
		}
		
		// ---------------------------------------------
		
		int a;
		System.out.print("정수 입력 : ");
		a= sc.nextInt();
		
		while (a > 0) {
			System.out.println(a);
			a--;
		}
		
		// ---------------------------------------------
		
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		int total = 0;
		int num2 = 1;
		
		while  (num2 < num + 1) {
			total += num2;
			num2++;
		}
		System.out.println(total);
		
		// ---------------------------------------------
		
		int i, temp, i2 = 0;
		System.out.print("정수 입력 : ");
		i = sc.nextInt();
		
		while (i != 0) {
			temp = i % 10;
			i = i / 10;
			i2 = i2 * 10 + temp;
		}
		System.out.println(i2);
		
		
		sc.close();
	}

}
