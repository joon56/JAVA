package casting;

public class prac01 {

	public static void main(String[] args) {
		String name = "홍길동";
		int korean = 70, english = 80, math = 98;
		int total = korean + english + math;
		double avg = total / 3.0;
		
		System.out.printf("이름 : %s (국 %d, 영 %d, 수 %d)\n", name, korean, english, math);
		System.out.printf("합계 : %d\n", total);
		System.out.printf("평균 : %.2f\n", avg);

	}

}
