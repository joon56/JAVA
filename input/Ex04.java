package input;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// String, char �Է�
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("�̸� �Է� : ");		
		name = sc.next();
		
		System.out.printf("����� �̸��� %s �Դϴ�\n", name);
		
		
		System.out.println(name.charAt(0));
		
		
		System.out.print("\n�����Է� : ");
		char  gender = sc.next().charAt(0);
		
		System.out.printf("%s�� ������ %c", name, gender);
		
		
		
		sc.close();
		
		

	}

}
