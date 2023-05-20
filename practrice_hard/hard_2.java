import java.util.Scanner;

class calc {
	
	double factorial(double num) {	// 팩토리얼 함수
	// 수 많은 시행착오를 거친 결과 왜인지는 모르겠으나 이 함수를 int로 선언하면 안된다.
	//팩토리얼의 결과는 int형이긴 하나 나중에 테일러에서 계산하는데 있어서 오류가 나는듯 하다.
	      double result = 1; 
	      if (num != 0) {		// 차수가 0이 아닐 때 입력된 매개변수 만큼 곱하는 for문

	         for (int i = (int) num; i > 0; i--) {
	            result *= i;
	         }
	         return result;

	      } else {
	         return result; 
	      }

	   }

	double multi(double root, double disp) {	// 승수 함수
		// 이 친구도 팩토리얼과 마찬가지의 이유로 double로 바꿔주었다.
	      double result = 1; 
	      if (disp != 0) {		// disp는 원래 거듭제곱된 수를 의미하지만 이를 for문에서 횟수처럼 활용하여 반복
	         for (int j = 0; j < disp; j++) {
	            result *= root;

	         }
	         return result;

	      } else {

	         return 1; 
	      }

	   }
}

class taylor {	// 테일러 전개 클래스 - c = 0인 경우의 맥클로린 급수를 활용하였다.
	
	double sin(int x) {	// sin, cos, e, 모두 비슷한 결이라서 한 번만 적겠습니다...
		calc cal = new calc();
		double result = 0;	// 최종결과 변수
		
		for(int i = 0; i < 100; i++) {	// 100울 사용한 이유 : 100에 해당하는 숫자는 얼마나 많이 더해주느냐 즉, 정확성에 관여한다. 그러나 더 많이 하면 정확해지긴 하지만 메모리가 감당하지 못해 오류가 난다.
			result += (cal.multi(-1, i) * cal.multi(x, 2*i + 1)) / cal.factorial(2*i + 1);	// 맥클로린 급수의 sinx 전개식
			
		}
		return result;
	}
	
	double cos(int x) {
		calc cal = new calc();
		double result= 0;
		
		for(int i = 0; i < 100; i++) {
			result += (cal.multi(-1, i) * cal.multi(x, 2*i)) / cal.factorial(2*i);
			
		}
		return result;
	}
	
	double e(int x) {
		double result= 0;
		calc cal = new calc();
		
		for(int i = 0; i < 100; i++) {
			result += cal.multi(x, i) / cal.factorial(i);
			
		}
		return result;
	}
}

public class hard_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		taylor num = new taylor();	// 테일러 클래스형 변수 생성
		int x = 0;
		
		System.out.print("테일러 급수를 구할 정수를 입력하시오 : ");	// 변수 입력
		x = sc.nextInt();
		
		System.out.println();
		System.out.printf("sin(%d)의 테일러 전개 : %f\n", x, num.sin(x));	// 테일러 클래스의 변수가 클래스 속 함수에 접근하여 값을 전달
		System.out.printf("cos(%d)의 테일러 전개 : %f\n", x, num.cos(x));
		System.out.printf("e^%d의 테일러 전개 : %f\n", x, num.e(x));
		
		sc.close();
	}

}
