//2번 패키지
package casting;


// 형변환 : 자료형 변환
// 1. 자동 형변환 : 연산시 발생, 쿤 타입으로 변환
       // 큰 타입은 byte 크기와 별개
// 2. 강제 형변환 : 개발자가 명시한 타입으로 변환
public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("10" + 20);
		// 원래는 타입이 달라서 연산 불가 -> 그러나 String이 int형보다 더 큰 타입이기 때문에 int가 String으로 변환
		// "1020" 됨
		
		System.out.println(10 + 3.14);
		// double형이 int보다 더 커서 10이 10.0으로 변환
		
		
		System.out.println("\n10 + 2 = " + 10 + 2);
		
		System.out.println("\n10 + 2 = " + (10 + 2));
		// 괄호를 치면 괄호 친거 먼저 비교
	}
	

}
