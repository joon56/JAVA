package input;

import java.io.IOException;

// 원래 입력은 class 개념까지 배워야 빠르게 이해 가능

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// System.in : 입력 개체
		
		int n;
		
		System.out.println("문자 하나 : "); 
		n = System.in.read();
		// 위에 출력 하나 안 적으면 별도로 콘솔창 실행하고 입력해야함
		
		System.out.println(n);
		
		// System.in 
		// 1. 예외처리 필요함
		// 2. 키값을하나 밖에 못 쓴다
	}

}
