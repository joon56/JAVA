package input;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Scanner의 next와 nextLine
		// 1. next
		// - space와 enter를 구분자로 인식
		// - 이전에 나온 space나 enter는 알아서 비움
		
		// 2. nextLine
		// - enter만 구분자로 인식, enter 공백도 같이 가져옴
		// - 이러한 것 때문에 이전에 입력한 enter까지 같이 인식하는 경우 발생
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("띄워쓰기 포함 입력 : ");
		//str = sc.next();
		str = sc.nextLine();
		
		System.out.println(str);
		
		sc.close();
		

	}

}
