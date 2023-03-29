package _abstract;

import other.Animal;
import other.FlyAble;

// 클래스의 상속
// - 기존의 기능을 확장시키기 위함 -> 'extends' 사용

// 인터페이스의 상속
// - 아무것도 없는 것을 오버라이드를 해서 구현을 해야함 -> 'implements'사용
// - 다중 상속이 가능하기 때문에 업캐스팅이 자유롭다

class Bird extends Animal implements FlyAble {
	Bird(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(name + "이가 짹짹");
		
	}

	@Override
	public void fly() {
		System.out.println(type + "로 날아간다");
		
	}
	
		
}
class Airplane implements FlyAble {

	@Override
	public void fly() {
		System.out.println("엔진으로 날아간다");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		Cat cat = new Cat("뚱이");
		Dog dog = new Dog("럭키");
		Bird bird = new Bird("구구");
		
		Animal[] ans = new Animal[] { cat, dog, bird };
		
		for (int i = 0; i < ans.length; i++) {
			ans[i].bark();
		}
		System.out.println();
		
		Airplane air = new Airplane();
		
		FlyAble[] flys = new FlyAble[] { bird, air };
		
		for (int i = 0; i < flys.length; i++) {
			flys[i].fly();
		}
		
	}

}
