package array;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// �迭 �ʱ�ȭ ���
		
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		int[] arr2 = new int[5]; // 5¥�� �޸��� �� �迭�� ����
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		System.out.println("\n");
		
		
		// �ڹٿ��� �迭�� ���ϰ� ����ϰ��ϱ� ���� Ŭ���� ����
		// Arrays Ŭ����
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		// �ݺ��� �� �ʿ� ���� �˾Ƽ� ��°�� �������
		// toString : ��Ҹ� ���ڿ��� �޾Ƽ� ��ȯ
	}

}
