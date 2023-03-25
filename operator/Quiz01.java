package operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		// -------------------------------------------------------------------
		
		int num1, num2;
		
		System.out.print("첫 번째 수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		num2 = sc.nextInt();
		
		int num3 = (num1 > num2) ? num1 : num2;
		
		System.out.println(num3);
		
		// -------------------------------------------------------------------
		
		int num;
		
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		String ans = (num % 2 == 0) ? "짝수이며" : "짝수 아님";
		String ans2 = (num % 5 == 0) ? " 5의 배수" : " 5의 배수 아님";
		System.out.println(ans + ans2);
		
		// -------------------------------------------------------------------
				
		int i;
		System.out.print("수 입력 : ");
		i = sc.nextInt();
		
		int i2 = (i < 0) ? -i : i;
		
		System.out.println(i2);
		
		sc.close();
	}

}
