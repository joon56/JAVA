package controlset;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// switch case��
		// ������ ������ �ڵ� �и�
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.println("1 ~ 3");
		menu = sc.nextInt();
		
		switch (menu) {    // �ڹٴ� ���ڿ��� switch�� �� �� ����
		case 1:
			System.out.println("1�� ����");
			break;							//break �� ���� �ϸ� 1 ���ý� 1, 2, 3 �� ������
		case 2:								//switch case�� case �����ϰ� ������ �ڵ� �� �����ϱ� ����
			System.out.println("2�� ����");
			break;
		case 3:
			System.out.println("3�� ����");
			break;
		default :
			System.out.println("���� �޴��Դϴ�.");
		}
		
		
		
		
		sc.close();
	}

}
