package wrapper;

// generic Ŭ����
// �ڷ����� ���ֹ��� �ʴ� ���α׷���

public class Ex03 {

	static <T> void printarr(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		
		// �Ϲ� Ÿ��
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		// Ŭ���� Ÿ��
		Integer[] arr2 = new Integer[] { 10,20,30,40,50 };
		Double[] arr3 = new Double[] { 3.14, 1.123, 5.1 };
		String[] arr4 = new String[] { "java", "c++", "python" };
		
		
		// printarr(arr1);
		// �Ϲ� Ÿ���� object�� ��ӹ��� �ʱ� ������ ���׸� ������
		printarr(arr2);
		printarr(arr3);
		printarr(arr4);
		System.out.println(arr1);
		
		// ���׸� Ŭ������ ������ ��� Object�� ��ĳ������ ���Ѽ� ��� �ڷ����� �Ѳ����� ó��
		// �׷��� int, double���� �Ϲ� Ÿ���� �ȵ� -> �׷��� ������ wrapper�� ó��
		
	}

}
