import java.util.Scanner;

public class practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14159;	// final 형으로 PI의 값 정의
		int radius;
		
		System.out.print("반지름을 입력하시오 : ");
		radius = sc.nextInt();		// 반지름 값 입력 받음
		
		double area = radius * radius * PI;	// 넓이 공식 정의
		
		System.out.printf("넓이는 : %f 입니다", area);
		
		sc.close();
	}

}
