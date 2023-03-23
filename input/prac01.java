package input;

import java.util.Scanner;

public class prac01 {

	public static void main(String[] args) {
		// 이름 나이 성별 주소 입력받을 변수 선언
		// 성별은 char
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("이름 : ");
		name = sc.next();
		
		int age;
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		char gender;
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		double height;
		System.out.print("신장 : ");
		height = sc.nextDouble();
		
		
		sc.nextLine();  // nextLine은 이전에 남았던 enter도 가져가기 때문에 버퍼가 밀려들어감 
		// 그래서 이를 방지하기 위해 밑에 newLine()을 쓸 예정이라면 위에 newLine()을 하나 더 생성하여 이전의 enter를 가져가게 함
		
		String address;
		System.out.print("주소 : ");
		address = sc.nextLine();
		
		System.out.printf("\n\n이름 : %s (%d세, %c)\n", name, age, gender);
		System.out.printf("신장 : %.1fcm\n", height);
		System.out.printf("주소 : %s", address);
		
		sc.close();
		

	}

}
