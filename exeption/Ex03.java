package exeption;

import java.util.Scanner;

// throws�� �����ϴ� ��
// throw�� ���ܴ� ����� ��

public class Ex03 {
	
	static void timer(int n) throws InterruptedException {
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "��");
			
			Thread.sleep(1000);
		}
	}
	
	static void isover(int n) throws InterruptedException {
		if (n > 5)
			throw new InterruptedException("5���� �Է�");
	}

	public static void main(String[] args) {
		// thread.sleep : ����
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("Ÿ�̸� : ");
			n = sc.nextInt();
			
			isover(n);
			
			timer(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
