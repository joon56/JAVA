package loop;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// �ݺ��� ����
		// ����Ƚ�� �ݺ�
		// ��Ư�� Ƚ�� �ݺ�
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		while (n != 0) {
			System.out.print("���� �Է� : ");
			n = sc.nextInt();
			
			System.out.println(n);
		}
		System.out.println("����");
		sc.close();
		
	}

}
