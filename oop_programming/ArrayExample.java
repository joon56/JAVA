package oop_programming;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]  weekdays = new String[7];		// �ε����� 7���ۿ� ��� ����� �Է����ݴϴ�.
		
		weekdays[0] = "Monday";
		weekdays[1] = "Tuesday";
		weekdays[2] = "Wednesday";
		weekdays[3] = "Thursday";
		weekdays[4] = "Friday";
		weekdays[5] = "Saturday";
		weekdays[6] = "Sunday";
		
		for(int i = 0; i < weekdays.length; i++) {	// weekdays�� ũ�⸸ŭ for���� ������ ���
			System.out.println(weekdays[i]);	// println ������ �ڵ����� �ٹٲ� �˴ϴ�.
		}
		
	}

}
