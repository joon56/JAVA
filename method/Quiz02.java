package method;



public class Quiz02 {
	
	static int abs(int n) {
		int result = 0;
		if ( n < 0) {
			result = -n;
		}
		else {
			result = n;
		}
		return result;
	}
	
	static int adder(int[] n) {
		int totalarr = 0;
		for (int i = 0; i < n.length; i++) {
			totalarr += n[i];
		}
		return totalarr;
	}
	
	static int max(int[] n) {
		int maxarr = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > maxarr) {
				maxarr = n[i];
			}
		}
		return maxarr;
	}
	
	static boolean isprime(int n) {
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 2) {
				return true;
			}
			
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = abs(-5);
		System.out.println(n);
		
		
		int[] arr = new int[] { 5,6,7,8,9};
		System.out.println(adder(arr));
		
		int maxarr = max(arr);
		System.out.println(maxarr);
		
		boolean prime = isprime(7);
		System.out.println(prime);
		
		// 1 ~ n 사이의 소수 모두 출력 : boolean형 함수 활용
		int count = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if (isprime(i)) {
				System.out.printf("%3d", i);
				count++;
			}
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}

}
