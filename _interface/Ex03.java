package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] { 10, 50, 40, 30, 20 };
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		// int ��ſ� ���� ������ Integar�� ���� ���
		// Integer�� object�迭�� �ֻ��� Ŭ������ �ȿ� �޼������ ����
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
			// o1 - o2�� ��������, �ݴ�� ��������
		};
		
		
		// ���� �ִ� Compare���� �̰� ��������, ��������, �յ��� ������ ���ϰ�
		// �̸� sort�� �޾� �����ϴ� ��
		Arrays.sort(arr, desc);
		System.out.println(Arrays.toString(arr));
		
		
		// �������ڿ��� �ٷ� ���ٽ�����  �ۼ��ؼ� �ѱ���� �ִ�
		Arrays.sort(arr, (Integer o1, Integer o2) -> o1 - o2);
		System.out.println(Arrays.toString(arr));
	}

}
