package array;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 10,20,30,40,50 };
		//                       0  1  2  3  4   index
		
		// �迭�� ����� �����͸� '���'��� �Ѵ�.
		// ��ҿ� �����ϱ� ���ؼ��� '��������'�� '�ε���'�� �ʿ���
		System.out.println(arr[1]);
		
		System.out.println(arr.length); // arr�� ũ��, ������ �� 
		
		// �迭�ȿ� ��� �� �����ϰ� ������ �ݺ������� ������
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d", i, arr[i]);
		}

	}

}
