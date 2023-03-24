// 1번 패키지
package variable;

public class Ex01 {
	 // ctrl + space 누리면 자동와성

	public static void main(String[] args) {   // main 치고 자동완성 하면 이거 자동
						                      // syso 치고 자동완성하면 System.out.println(); 완성
		//변수 선언
		// 자료형 변수형 = 값;
		
		int n = 10;
		
		System.out.println(n);  //변수 호출
		
		System.out.println("n = " + n);
		
		// 기존에 이미 만들어진 변수를 재사용시 자료형은 붙이지 않는다
		
		n = 20;
		
		System.out.println("n = " + n); //20이 다시 대입되서 실행됨
	}

}
