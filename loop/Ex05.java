package loop;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// do while��
		// ���� �� ���� ������ ����ȴ�.
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		do {
			System.out.print("���� �Է� (0 ����) : ");
			n = sc.nextInt();
			
			System.out.println(n);
		}while (n != 0);
		
		
		sc.close();
		
	}

}
