// 3�� ��Ű��
package operator;

public class Ex01 {

	public static void main(String[] args) {
		// ��� ������ : ��Ģ���� ����
		// ���� : +, -, *, /,  %  ���̽㸸ŭ ���� ����
		int n = 10;
		
		// ��������ڴ� ������ �� ��ü�� ������ ���� ���� 
		System.out.println("n + 3 = " + (n + 3));
		System.out.println("n - 3 = " + (n - 3));

		// ���ϱ� ������� ���ʿ� �켱������ ���Ƽ� ���� ��ȣ �� �ĵ� ������ ���� ��
		System.out.println("n * 3 = " + n * 3);
		System.out.println("n / 3 = " + n / 3);
		System.out.println("n % 3 = " + n % 3);
		
		// ������ ���� ���ó
		// 1. ��� ����  (n % 2 == 0)
		// 2. ���� ���� ���� 
		// 3. ���� �ڸ��� ����
		
		int num = 123456;
		
		System.out.println(num % 10);
		System.out.println(num / 100000);
		System.out.println(num % 1000 / 10);
		
		
		int birth = 991215;
		
		int year = birth / 10000;
		int month = birth % 10000 / 100;
		int day = birth % 100;
		
		System.out.println("���� : " + year);
		System.out.println("���� : " + month);
		System.out.println("���� : " + day);
	}

}
