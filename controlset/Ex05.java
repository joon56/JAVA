package controlset;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// switch���� ���� ���� ó���� ���� �Ұ����ϴ�
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Է� 1~10");
		n = sc.nextInt();
		
		switch (n) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 9 :
			System.out.println("Ȧ��");
			
		case 2 : case 4 : case 6 : case 8 : case 10 :  // �� �ٷ� �ᵵ ��
			System.out.println("¦��");			
		
		}
		sc.close();
	}

}
