

public class practice_1 extends thread{
	String seq;
	
	public void sample (String seq) {
		this.seq = seq;
	}
	public void run() {
		System.out.println(this.seq + " thread start.");
		
	}

	public static void main(String[] args) {
		
		String[] a = {"������", "�������б�", "����", "22�й�", "20��", "�ڹ�", "���̽�", "C���", "������", "���α׷�"};
		practice_1 p = new practice_1();
		
		
		
		for (int t = 0; t < 10; t++) {
			p.sample(a[t]);
			p.run();
		}

	}

}
