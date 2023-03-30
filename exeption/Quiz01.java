package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			try {
		
				System.out.print("정수를 입력하시오 : ");
				n = sc.nextInt();
		
				System.out.printf("입력된 정수는 %d입니다", n);
				break;
			}
			catch(InputMismatchException e) {
			
				System.err.print("정수를 다시 입력하세요");
				
				sc.nextLine();
			
			}
			finally {
				sc.close();
			}
		}
		
	}

}
