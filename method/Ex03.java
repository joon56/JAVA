package method;

public class Ex03 {

	// �޼ҵ��� ����
	// ��ȯ���� �ִ� �޼ҵ� / ��ȯ���� ���� �޼ҵ�
	
	static int adder(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n = adder(3, 4);
		// ��ȯ���� �ִ°Ŵ� �Լ��� �����Ѵ� �ؼ� ��µǴ°� �ƴ϶�
		// �ٸ� ���� �ȿ� ��ȯ���� �־� ���� ����ϰų� �׳� �ٷ� �ִ´�� ����Ѵ�
		System.out.println(n);
		System.out.println(adder(1, 2) + adder(4, 5));
	}

}
