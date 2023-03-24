package variable;

public class prac01 {

	public static void main(String[] args) {
		// 이름, 나이, 키, 성별, 주소를 저장할 변수들을 선언한다
		//성별은 char로 선언
		
		// 위 변수들 값 채우기
		
		String name = "홍길동";
		int age = 17;
		double height = 171.1;
		char sex = '남';
		
		System.out.println("이름 : " + name + ", " +  age + '세');
		System.out.println("신장 : " + height + "cm");
		System.out.println("성별 : " + sex);
		
		// printf로 표현하면 좀 편하긴 함
		// %f : 기본 소수점 6자리까지 출력
		// %.xf : x에 자연수 넣으면 해당 자리만큼 소수점 출력
	}

}
