package controlset;

import java.util.Scanner;

// ��� : �ڵ��� �帧�� �����ϴ� ����
// ���ǹ� : ��/������ ���� �ڵ� ����
// �ݺ��� : ��/������ ���� ���� ����
// ���� ��� : ���� ������ �����ϴ� ����
public class Ex01 {

	public static void main(String[] args) {
		// ���ǹ� if : ���̸� ���� ���� ����
		// ���� ���� : Ư�� �κп� ���Ե� ����
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("����");
			
		}

		else {
			System.out.print("���� �ƴ�");
		}
		
		sc.close();

	}

}
