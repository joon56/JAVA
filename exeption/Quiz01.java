package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			try {
		
				System.out.print("������ �Է��Ͻÿ� : ");
				n = sc.nextInt();
		
				System.out.printf("�Էµ� ������ %d�Դϴ�", n);
				break;
			}
			catch(InputMismatchException e) {
			
				System.err.print("������ �ٽ� �Է��ϼ���");
				
				sc.nextLine();
			
			}
			finally {
				sc.close();
			}
		}
		
	}

}
