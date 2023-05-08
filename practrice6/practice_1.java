class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class practice_1 {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		// 모두 A로부터 상속된 것들이라서 에러가 나지 않는다.
		
		B b1 = d;
		C c1 = e;
		
		// B b3 = e; 상솩관계가 아니므로 에러가 난다.
		// C c2 = d; 위와 같은 이유로 에러가 난다.
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(b1);
		System.out.println(c1);

	}

}
