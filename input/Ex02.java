package input;

import java.lang.System; //���� System.in, out ������ �̰� �������, �׷��� ���� ���ϱ� �ڵ����� ���� �� ��
import java.util.Scanner;

// lang�� ������Ŭ������ �� import �ؾ���

public class Ex02 {

	public static void main(String[] args) {
		// �����͸� ���� �о�� �� �ְ� �����ִ� ����
		// Scanner Ŭ����
		
		Scanner sc = null;
		
		sc = new Scanner(System.in);  // scanner�� ��ȣ ���� �κ��� ��ĵ��
		
		int n;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();  // �������� �������� ��
		
		System.out.println(n);
		
		sc.close(); // �� ������ scanner�� ��� ��ȣ �� �κ��� ���� �־ ��� �� -> scanner �ݱ� ����ȭ

	}

}
