import java.util.Scanner;

public class practice_1 {
	
	static double getweight() {		// 몸무게는 입력은 정수형태로 받지만 반환은 실수형으로 받아야하기 떄문에 자동 형 변환을 위해 double로 선언한다
		Scanner sc1 = new Scanner(System.in);	// 스캐너를 쓰기 위해 각 함수 별로 따로 스캐너를 사용한다.
		System.out.print("몸무게를 입력하시오 : ");
		double weight = sc1.nextDouble();
		
		return weight;
	}
	
	static double getheight() {		// 몸무게 함수와 동일
		Scanner sc2 = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		double height = sc2.nextDouble();
		
		return height;
	}
	
	static double bmi(double height, double weight) {	//이 함수에 bmi 출력까지 담아버리면 return을 받기 전 출력을 하기 때문에 값이 설정이 되기 전임.
		return (weight / (height*height))*10000;
	}
	
	static void printbmi() {							// 그래서 print하는 함수를 따로 설정한다.
		System.out.println(bmi(getheight(), getweight()));
	}
	
	public static void main(String[] args) {
		
		printbmi();
		
		
	}

}
