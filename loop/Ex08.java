package loop;

public class Ex08 {

	public static void main(String[] args) {
		// ���� ���
		// break��
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");  // 1 2 3 4 ���
		}
		System.out.println();
		
			
		// continue��
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				continue;				// continue�� ��Ÿ���� �� �����ϰ� ���
			}
			System.out.print(i + " ");  // 1 2 3 4  6 7 8 9 10 ���
		}
		System.out.println();

	}

}
