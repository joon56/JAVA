package loop;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("���� �Է� : ");
			n = sc.nextInt();
			
			if (n == 0)
				break;
			
			System.out.println(n);
		}
		
		sc.close(); // �׳� while true�ϰ� close�ϸ����
					// �ֳ��ϸ� while���� ���� ������ close���� ������ �� ���� ����

	}

}
