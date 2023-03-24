package loop;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			if (n == 0)
				break;
			
			System.out.println(n);
		}
		
		sc.close(); // 그냥 while true하고 close하면오류
					// 왜냐하면 while문이 무한 루프라서 close까지 도달할 수 없기 때문

	}

}
