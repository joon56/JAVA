package array;

public class Ex01 {

	public static void main(String[] args) {
		// 배열 : 메오리에서 연속된 공간
		
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };
		
		int[] arr2 = arr1;
		
		int arr3[] = new int[] { 10,20,30,40,50 };
		
		System.out.println(arr1); // 해시 코드라는 이상한 값이 나옴, 객체 구분을 위한 값-메모리 주소 아님!!!!
		System.out.println(arr2);
		System.out.println(arr3);
				
		

	}

}
