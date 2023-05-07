class calculator_2 {
	public static final int PI = 3;
}
public class practice_4 {

	public static void main(String[] args) {
		calculator_2 c1 = new calculator_2();
		System.out.println(c1.PI);
		// final로 지정된 변수에는 한 번 값이 할당되면 그 값을 바꿀 수 없기 때문에 오류가 발생한다.
		//calculator_2.PI = 10;
		System.out.println(c1.PI);

	}

}
