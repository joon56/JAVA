package loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		// --------------------------------------------
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		// --------------------------------------------
		
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
		System.out.println("\n");
		// --------------------------------------------
		
		int a;
		System.out.print("수 입력 : ");
		a = sc.nextInt();
		int j = 0;
		
		for (int i = 1; i <= a; i++) {
			if(a % i ==0 ) {
				j += 1;
			}
		}
		if(j == 2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수 아님");
		}
		sc.close();
		
	}

}
