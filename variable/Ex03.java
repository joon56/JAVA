package variable;

public class Ex03 {

	public static void main(String[] args) {
		// 앞선 자료형을 제외한 모든 자료형을 '참조 자료형'아라함
		
		// 참조 타입 : 실제 데이터를 '가리킨다'
		int[] arr = new int[] { 10, 20, 30};
		
		System.out.println(arr);   // 여기서 출력되는 값 주소 아님! 자바는 주소 안 씀 ( hash code임 )
		
		String str = "Hello Java";
		
		System.out.println(str);
	}

}
