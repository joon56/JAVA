package controlset;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Java�� switch case���� ���ڿ� ó�� ����
		Scanner sc = new Scanner(System.in);
		String menu;
		
		System.out.println("\t1. ¥���");
		System.out.println("\t2. «��");
		System.out.println("\t3. ������");
		
		System.out.print("�޴��� : ");
		menu = sc.next();
		
		switch (menu) {
		case "¥���": 
			System.out.println("¥���");
			break;
		case "«��":
			System.out.println("«��");
			break;
		case "������":
			System.out.println("������");
			break;
		default :
			System.out.println("�׷� �޴� �����ϴ�");
		}
		
		sc.close();
	}

}
