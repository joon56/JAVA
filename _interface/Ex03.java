package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] { 10, 50, 40, 30, 20 };
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		// int 대신에 넓은 범위의 Integar을 쓰는 경우
		// Integer는 object계열의 최상위 클래스로 안에 메서드들이 있음
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
			// o1 - o2는 오름차순, 반대는 내림차순
		};
		
		
		// 위에 있는 Compare에서 이걸 내림차순, 오름차순, 둥등의 기준을 정하고
		// 이를 sort가 받아 정렬하는 것
		Arrays.sort(arr, desc);
		System.out.println(Arrays.toString(arr));
		
		
		// 전달인자에서 바로 람다식으로  작성해서 넘길수도 있다
		Arrays.sort(arr, (Integer o1, Integer o2) -> o1 - o2);
		System.out.println(Arrays.toString(arr));
	}

}
