class calculator_1 {

	public static int PI = 3;
		
		
	}
public class practice_3 {

	public static void main(String[] args) {
		calculator_1 c1 = new calculator_1();
		System.out.println(c1.PI);
		// final로 지정된 변수에는 한 번 값이 할당되면 그 값을 바꿀 수 없기 때문에 오류가 발생한다.
		calculator_1.PI = 10;
		System.out.println(c1.PI);
		calculator_1 c2 = new calculator_1();
		System.out.println(c2.PI);

	}

}
