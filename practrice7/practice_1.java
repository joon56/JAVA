

public class practice_1 extends thread{
	String seq;
	
	public void sample (String seq) {
		this.seq = seq;
	}
	public void run() {
		System.out.println(this.seq + " thread start.");
		
	}

	public static void main(String[] args) {
		
		String[] a = {"유민준", "연세대학교", "디헬", "22학번", "20살", "자바", "파이썬", "C언어", "리눅스", "프로그램"};
		practice_1 p = new practice_1();
		
		
		
		for (int t = 0; t < 10; t++) {
			p.sample(a[t]);
			p.run();
		}

	}

}
