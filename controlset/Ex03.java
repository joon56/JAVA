package controlset;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// ��ø ���ǹ�
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		if (num %2 == 0 ) {
			System.out.println("¦��");
			
			if (num % 3 == 0) {
				System.out.println("¦�� + 3�� ���");
			}
		}
		
		
		
		else {
			System.out.println("Ȧ��");
			if ( num % 3 == 0) {
				System.out.println("Ȧ�� + 3�� ���");
			}
			else if (num % 5 == 0) {
				System.out.println("Ȧ�� + 5�� ���");
			}
		}
		
		sc.close();
	}

}
