class calculator_1 {

	public static int PI = 3;
		
		
	}
public class practice_3 {

	public static void main(String[] args) {
		calculator_1 c1 = new calculator_1();
		System.out.println(c1.PI);
		// final�� ������ �������� �� �� ���� �Ҵ�Ǹ� �� ���� �ٲ� �� ���� ������ ������ �߻��Ѵ�.
		calculator_1.PI = 10;
		System.out.println(c1.PI);
		calculator_1 c2 = new calculator_1();
		System.out.println(c2.PI);

	}

}
