package input;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Scanner�� next�� nextLine
		// 1. next
		// - space�� enter�� �����ڷ� �ν�
		// - ������ ���� space�� enter�� �˾Ƽ� ���
		
		// 2. nextLine
		// - enter�� �����ڷ� �ν�, enter ���鵵 ���� ������
		// - �̷��� �� ������ ������ �Է��� enter���� ���� �ν��ϴ� ��� �߻�
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("������� ���� �Է� : ");
		//str = sc.next();
		str = sc.nextLine();
		
		System.out.println(str);
		
		sc.close();
		

	}

}
