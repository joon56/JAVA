import java.util.Scanner;

public class practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14159;	// final ������ PI�� �� ����
		int radius;
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = sc.nextInt();		// ������ �� �Է� ����
		
		double area = radius * radius * PI;	// ���� ���� ����
		
		System.out.printf("���̴� : %f �Դϴ�", area);
		
		sc.close();
	}

}
