
public class practice_2 {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {	// 예외 발생
			System.out.println("실행 매개 값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExam num1 num2");
			// return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);	// 숫자가 아닐 경우 예외 발생 null이므로 발생
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환될 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요.");	// 항상 실행되는 코드
		}

	}

}
