package input;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// ���� : �����͸� �ӽ÷� �����ϴ� ����
		// Scanner�� Buffer�� ������ ���ɴ�
		// buffer�� �����Ͱ� ������ ����ڿ��� �Է� �䱸
		//�Է� �Ϸ� �� �����͸� ���������� ������
		// ���⼭ �����ڴ� space�� enter
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("�� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.printf("n1 = %d, n2 = %d", n1, n2);
		
		
		sc.nextLine();
		// ���ۿ��� enter���� ��� �������� ����
		// space�� �����ڷ� �ν���������
		// ******���۰� �з����� �� ����*******
	
		int n3, n4;
		
		System.out.print("\n�ٽ� �� ���� �Է� = ");  
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.printf("n3 = %d,n4 = %d", n3, n4);
		
		sc.close();

	}

}
