package method;

public class Ex04 {
	
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static int adder(int n) {
		return n + 1000;
	}
	
	static double adder(double n) {
		return n + 3.14;
	}
	
	public static void main(String[] args) {
		// method overload : ���� �̸���  �޼ҵ带 ���� �� �ۼ��ϴ� ���
		// �̸��� ���ƾ� �ϰ� �Ű������� ���´� �޶�� �Ѵ�
		// ��ȯ���� �����ε��� ������ ���� �ʴ´� -> �Լ� �̸��̶� �Ű������� ������ ������ ���� �Լ��� ���
		
		System.out.println(adder(5, 4));
		
		System.out.println(adder(5));
		
		System.out.println(adder(5.0));
	}

}
