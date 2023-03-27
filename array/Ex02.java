package array;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 10,20,30,40,50 };
		//                       0  1  2  3  4   index
		
		// 배열에 저장된 데이터를 '요소'라고 한다.
		// 요소에 접근하기 위해서는 '참조변수'와 '인덱스'가 필요함
		System.out.println(arr[1]);
		
		System.out.println(arr.length); // arr의 크기, 데이터 수 
		
		// 배열안에 든거 다 나열하고 싶으면 반복문으로 돌리기
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d", i, arr[i]);
		}

	}

}
