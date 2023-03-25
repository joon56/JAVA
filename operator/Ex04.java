package operator;

public class Ex04 {

	public static void main(String[] args) {
		// 증감연산자 : 피연산자 1증가, 감소
		
		int n = 10;
		
		n++;
		System.out.println(n);
		
		n--;
		System.out.println(n);
		
		++n;
		System.out.println(n);
		
		--n;
		System.out.println(n);
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;
		System.out.println(n2);	
		
		n1 = 10;
		
		n3 = n1++;
		System.out.println(n3);
		
	}

}
