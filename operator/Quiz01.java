package operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		// -------------------------------------------------------------------
		
		int num1, num2;
		
		System.out.print("ù ��° �� �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print("�� ��° �� �Է� : ");
		num2 = sc.nextInt();
		
		int num3 = (num1 > num2) ? num1 : num2;
		
		System.out.println(num3);
		
		// -------------------------------------------------------------------
		
		int num;
		
		System.out.print("�� �Է� : ");
		num = sc.nextInt();
		
		String ans = (num % 2 == 0) ? "¦���̸�" : "¦�� �ƴ�";
		String ans2 = (num % 5 == 0) ? " 5�� ���" : " 5�� ��� �ƴ�";
		System.out.println(ans + ans2);
		
		// -------------------------------------------------------------------
				
		int i;
		System.out.print("�� �Է� : ");
		i = sc.nextInt();
		
		int i2 = (i < 0) ? -i : i;
		
		System.out.println(i2);
		
		sc.close();
	}

}
