package wrapper;

// generic 클래스
// 자료형에 구애받지 않는 프로그래밍

public class Ex03 {

	static <T> void printarr(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		
		// 일반 타입
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		// 클래스 타입
		Integer[] arr2 = new Integer[] { 10,20,30,40,50 };
		Double[] arr3 = new Double[] { 3.14, 1.123, 5.1 };
		String[] arr4 = new String[] { "java", "c++", "python" };
		
		
		// printarr(arr1);
		// 일반 타입은 object를 상속받지 않기 때문에 제네릭 못받음
		printarr(arr2);
		printarr(arr3);
		printarr(arr4);
		System.out.println(arr1);
		
		// 제네릭 클래스의 원리는 모두 Object로 업캐스팅을 시켜서 모든 자료형을 한꺼번에 처리
		// 그러나 int, double같은 일반 타입은 안됨 -> 그래서 무조건 wrapper로 처리
		
	}

}
