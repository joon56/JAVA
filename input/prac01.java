package input;

import java.util.Scanner;

public class prac01 {

	public static void main(String[] args) {
		// �̸� ���� ���� �ּ� �Է¹��� ���� ����
		// ������ char
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("�̸� : ");
		name = sc.next();
		
		int age;
		System.out.print("���� : ");
		age = sc.nextInt();
		
		char gender;
		System.out.print("���� : ");
		gender = sc.next().charAt(0);
		
		double height;
		System.out.print("���� : ");
		height = sc.nextDouble();
		
		
		sc.nextLine();  // nextLine�� ������ ���Ҵ� enter�� �������� ������ ���۰� �з��� 
		// �׷��� �̸� �����ϱ� ���� �ؿ� newLine()�� �� �����̶�� ���� newLine()�� �ϳ� �� �����Ͽ� ������ enter�� �������� ��
		
		String address;
		System.out.print("�ּ� : ");
		address = sc.nextLine();
		
		System.out.printf("\n\n�̸� : %s (%d��, %c)\n", name, age, gender);
		System.out.printf("���� : %.1fcm\n", height);
		System.out.printf("�ּ� : %s", address);
		
		sc.close();
		

	}

}
