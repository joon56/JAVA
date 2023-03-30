package exeption;

import java.util.Scanner;

// throws는 전가하는 것
// throw는 예외는 만드는 것

public class Ex03 {
	
	static void timer(int n) throws InterruptedException {
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
	}
	
	static void isover(int n) throws InterruptedException {
		if (n > 5)
			throw new InterruptedException("5이하 입력");
	}

	public static void main(String[] args) {
		// thread.sleep : 전가
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("타이머 : ");
			n = sc.nextInt();
			
			isover(n);
			
			timer(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
