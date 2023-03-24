package loop;

// 자바는 전역변수가 없음 !!!!

public class Ex07 {

	public static void main(String[] args) {
		// 지역변수 : 특정 영역 안에서 생성된 변수
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// System.out.println(i); 오류구문
		// 반복이 끝나면 i를 지역변수이기 때문에 메모리가 제거됨. 사용 불가능
		// i는 for문의 지역변수이기 때문에 for문 끝나면 사라짐
		
		int i;  // main함수의 변수
		
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		

	}

}
