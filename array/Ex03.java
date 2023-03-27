package array;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 배열 초기화 방식
		
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		int[] arr2 = new int[5]; // 5짜리 메모리의 빈 배열을 만듦
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		System.out.println("\n");
		
		
		// 자바에서 배열을 편하게 사용하게하기 위해 클래스 존재
		// Arrays 클래스
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		// 반복문 쓸 필요 없이 알아서 통째로 출력해줌
		// toString : 요소를 문자열로 받아서 반환
	}

}
