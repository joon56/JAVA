package method;

public class Ex02 {

	
	static void hello(int n) {  // �Ű����� : �������� ���� ����
		for (int i = 1; i <= n; i++) {
			System.out.println("hello");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		

		hello(3); // ��������(arguments)
		hello(4);
		
		
		
	}

}
