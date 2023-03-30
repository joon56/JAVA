package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// try���� ���� ���ܸ� ó���ϴ� ����
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		try {
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		System.out.println("n = " + n);
		
		}catch(InputMismatchException e) {
			
			System.out.println("���� �޼��� : �ڷ��� ����");
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		// catch���� ������ �ۼ��Ͽ� �������� ���ܵ鿡 ���ؼ� ó��
		
		catch(Exception e) {
			// Exception Ŭ������ ���� Ŭ������ �ֻ��� Ŭ����
			// ��� ���� �� �޾���
			// ���� �𸣴� ������ ����, Ȥ�� ��� ���� ���� ������ ��
			
			System.out.println(e.getMessage());
		}
		
		finally {
			// ���� �߻��� ������� ������ ����ȴ�
			// sc.closeó�� �ڿ��� ȸ���ϱ� ���ؼ� ���
			
			sc.close();
		}
		
		
	}

}
