package oop_programming;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> weekdays = new ArrayList<String>(); // String arraylist ����
		
		weekdays.add("Monday");			// arraylist add �������� �� �߰�
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");
		
		for(String i : weekdays) { //for���� ���� ��ü���
		    System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		
		weekdays.remove(2);			//arraylist remove �������� wednesday�� 2�� �ε��� ����
		
		for(String i : weekdays) { //for���� ���� ��ü���
		    System.out.println(i);
		}
	}

}
