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
		// ��� A�κ��� ��ӵ� �͵��̶� ������ ���� �ʴ´�.
		
		B b1 = d;
		C c1 = e;
		
		// B b3 = e; ��ް��谡 �ƴϹǷ� ������ ����.
		// C c2 = d; ���� ���� ������ ������ ����.
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(b1);
		System.out.println(c1);

	}

}
