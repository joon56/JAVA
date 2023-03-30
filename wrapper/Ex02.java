package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		// wrapper 클래스는 클래스라서 일반 타입과 형변환이 일어나지 않는다
		
		String str1 = "10";
		String str2 = "10";
		
		System.out.println(str1 + str2);
		
		int n1 = Integer.parseInt(str1);
		// 문자열에서 숫자를 찾아 parseInt를 통해 int로 처리
		// 단, 숫자가 아닌 것일 경우 오류
		
		System.out.println(n1 + 2);
		
		
		
		
		// 정수 -> 문자열
		str1 = Integer.toString(3541);
		// 정수를 문자열로 바꾸는거익 때문에 ""치면 안됨
		
		System.out.println(str1);
		
		// 좀 더 쉬운 정수 -> 문자열 형변환
		String str = 10 + 13 + "";
		String str0 = "" + 10 + 13;
		
		System.out.println(str);
		System.out.println(str0);
		
		
		
		// 문자열 -> 실수
		double d1 = Double.parseDouble("3.141592");
		System.out.println(d1);
		
	}

}
