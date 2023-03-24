package loop;

public class Ex08 {

	public static void main(String[] args) {
		// 보조 제어문
		// break문
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");  // 1 2 3 4 출력
		}
		System.out.println();
		
			
		// continue문
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				continue;				// continue가 나타내는 것 제외하고 출력
			}
			System.out.print(i + " ");  // 1 2 3 4  6 7 8 9 10 출력
		}
		System.out.println();

	}

}
