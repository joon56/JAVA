package casting;

public class prac01 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		int korean = 70, english = 80, math = 98;
		int total = korean + english + math;
		double avg = total / 3.0;
		
		System.out.printf("�̸� : %s (�� %d, �� %d, �� %d)\n", name, korean, english, math);
		System.out.printf("�հ� : %d\n", total);
		System.out.printf("��� : %.2f\n", avg);

	}

}
