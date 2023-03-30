package exeption;

// 예외 경우
// 1. 에러 : system 레벨의 오류 - 처리하는게 불가능
// 2. 예외 : 질못된 코드 문법 방향 - 처리가 가능

// 예외를 예측해서 처리하는 것을 예외처리라고 한다

public class Ex01 {

	public static void main(String[] args) {
		
		try {	// 예외를 검사하는 구문
			System.out.println(10 / 0);
			
			System.out.println("정상종료!");	// try에서 예외가 발생항 시점 이후로는 실행 안됨
		}catch(ArithmeticException e) {		// 괄호 안에 오류 구문을 넣음 + 변수
			System.err.println("예외발생");	// err을 하면 다른색깔로 출력됨
			
			System.err.println(e.getMessage());	// 1. 오류 메세지를 출력!! 중요
			
			e.printStackTrace();	// 2. 어떤 메서드에서 오류가 발생했는지 구체적으로 알려줌
		}
		
	}

}
