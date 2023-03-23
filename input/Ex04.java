package input;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// String, char 입력
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("이름 입력 : ");		
		name = sc.next();
		
		System.out.printf("당신의 이름은 %s 입니다\n", name);
		
		
		System.out.println(name.charAt(0));
		
		
		System.out.print("\n성별입력 : ");
		char  gender = sc.next().charAt(0);
		
		System.out.printf("%s님 성별은 %c", name, gender);
		
		
		
		sc.close();
		
		

	}

}
