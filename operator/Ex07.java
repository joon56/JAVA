package operator;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// ���ǿ����� : ���ǿ� ���� ���� �����ϴ� ������
		// ���� : a++ ������
		// ���� : a + b ������
		// ���� : ���ǽ� ? �� : ����
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("��� �Է� : ");
		n = sc.nextInt();
		
		String even = (n % 2 == 0) ? "¦��" : "Ȧ��";
		
		System.out.printf("%d�� %s�Դϴ�", n, even);
		sc.close();

	}

}
