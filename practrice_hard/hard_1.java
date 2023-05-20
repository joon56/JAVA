import java.util.Scanner;

public class hard_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price;	// 가격 - 조교님께서 굳이 197.55로 안해도 된다고 하셔서 입력받게 하였습니다.
		
		System.out.print("가격을 입력하시오(소수 2번쨰 자리까지) : ");
		price = sc.nextDouble();
		
		double taxrate = 0.06;	// 세율
		double tax = price * taxrate;	// 부가세 계산식
		
		System.out.printf("부가세는 : %d달러이다\n", (int)tax);	// 강제 형변환 int형으로 (원래 tax는 0.06 곱하니까 실수형임)
		System.out.printf("세율을 고려한 가격은? : %d달러이다", (int)(price - tax));	// 위와 마찬가지로 형변환
		
		sc.close();
	}

}
