package loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		// --------------------------------------------
		
		int num;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		// --------------------------------------------
		
		int n;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
		System.out.println("\n");
		// --------------------------------------------
		
		int a;
		System.out.print("�� �Է� : ");
		a = sc.nextInt();
		int j = 0;
		
		for (int i = 1; i <= a; i++) {
			if(a % i ==0 ) {
				j += 1;
			}
		}
		if(j == 2) {
			System.out.println("�Ҽ�");
		}
		else {
			System.out.println("�Ҽ� �ƴ�");
		}
		sc.close();
		
	}

}
