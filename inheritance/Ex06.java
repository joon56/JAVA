package inheritance;

import other.Herit;



public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Herit per = new Herit("이모씨", 20);
		Student stu = new Student("홍길동", 15, "고등학생");
		Police pol = new Police("이진호", 27, "경위");
		Doctor doc = new Doctor("김모씨", 30, "내과");
		
		
		Herit[] peo = new Herit[] { per, stu, pol, doc };
		
		peo[0].showInfo();
		peo[3].showInfo();
		// 똑같이 Herit로 묶였는데 왜 자식 클래스의 것도 실행되는가?
		// Herit로 묶여도 선언이 된게 자식이 클래스 형이라면 그걸 기반으로 해석!!
		// <다형성> 구현하는데 쓰임
		
		// ((Doctor(peo[2])).cure(stu); police는 doctor가 아니라서 안됨.
		
		// 다운 캐스팅을 할 때 원래의 타입과 다르면 예외 오류가 발생함
		// 이를 판별하는 'instanceof'라는 키워드가 있다
		
		System.out.println();
		
		System.out.println(peo[3] instanceof Doctor);
		// 참거짓 형, true, false
		
		System.out.println(peo[2] instanceof Police);
		
		System.out.println(peo[2] instanceof Student);
		
		

	}

}
