package _abstract;

import other.Triangle;

// 추상 클래스 : 추상적인 개념의 객체를 표시하기 위한 공간
// 사람, 동물, 도형 등...


// 추상클래스의 특징
// 1. 추상적인 객체이기 때문에 형태가 없다, '인스턴스' 생성불가!!
// 단, 참조변수는 사용가능!

// 2. 추상클래스는 내부에 추상 메서드를 가질 수 있다
// 추상 메서드란?
// 이름만 있고 기능이 없는 껍데기
// 상속 받은 자식 메소드에서 오버라이딩을 해서 구현을 해야함

public class Ex01 {

	public static void main(String[] args) {
		
		
		// fig = new Figure();
		// 추상적인 객체는 형태가 업어 new라는 인스턴스화가 안된다
		
		Triangle tri = new Triangle();
		
		System.out.println(tri);
		

	}

}
