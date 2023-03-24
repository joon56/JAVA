package variable;

// 승 : 0 1 2 3 4  5  6   7   8   9   10         16
// 값 : 1 2 4 8 16 32 64 128 256 512 1024       65536
/*
 boolean  참/거짓   1bit
 char     문자       2byte    java는 아스키코드 사용 안해서 2바이트임
 byte     정수	 1byte
 short	   정수	 2byte
 int      정수	 4byte	  정수 대표타입
 long     정수       8byte
 float    실수       4byte
 double   실수	 8byte	  실수 대표타입
*/
public class Ex02 {

	public static void main(String[] args) {
		
		boolean bo = true;  //소문자 주의
		char ch = 'A'; 		//작은 따옴표 주의
		byte by = 127;
		short sh = 32767;
		int in = 2000000000;
		
		// 리터럴 : 임시값, 변수에 저장되지 않은 데이터
		// 메모리 임시 저장 공간 = 상수풀
		// 상수풀은 데이터를 대표타입으로 생성해서 임시 저장
		
		long lo = 3000000000L; // 뒤에 L 붕이면 long 형으로 변환 대소문자 상관없음
		float fl = 1.12345678F; // F는 float으로 저장
		
		double db = 1.12345678;
		
		System.out.println("bo = " + bo);
		System.out.println("ch = " + ch);
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("in = " + in);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
		

	}

}
