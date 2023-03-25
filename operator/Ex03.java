package operator;

public class Ex03 {

	public static void main(String[] args) {
		// 복합 대입 연산자
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		
		int n = 10;
		
		System.out.println(n);
		
		n += 10;
		System.out.println(n);
		
		n -= 3;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		n /= 3;
		System.out.println(n);
		
		n %= 7;
		System.out.println(n);
		
		
		//quiz
		
		int a = 2, b = 1, c = 3;
		
		a += b *= c-= 1;
		
		System.out.println(a); //4
		System.out.println(b); //2
		System.out.println(c); //2
		
		

	}

}
