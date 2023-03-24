package loop2;

public class Ex01 {

	public static void main(String[] args) {
		// 중첩 반복문 : 반북문안에 반복문
		// 바깥 for문 : 행 반복
		// 안쪽 for문 : 열 반복
		
		for (int i = 0; i <= 5; i++ ) {
			for (int j = 0; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
