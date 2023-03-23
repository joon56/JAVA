package controlset;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// else if 
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("성인");
		}
		else if (age >= 17) {
			System.out.println("고등학생");
		}
		else {
			System.out.println("잼민");
		}
		System.out.println("이하입니다");
		sc.close();
	}

}
