package controlset;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// else if 
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("����");
		}
		else if (age >= 17) {
			System.out.println("����л�");
		}
		else {
			System.out.println("���");
		}
		System.out.println("�����Դϴ�");
		sc.close();
	}

}
