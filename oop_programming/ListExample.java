package oop_programming;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> weekdays = new ArrayList<String>(); // String arraylist 생성
		
		weekdays.add("Monday");			// arraylist add 문법으로 값 추가
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");
		
		for(String i : weekdays) { //for문을 통한 전체출력
		    System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		
		weekdays.remove(2);			//arraylist remove 문법으로 wednesday의 2번 인덱스 삭제
		
		for(String i : weekdays) { //for문을 통한 전체출력
		    System.out.println(i);
		}
	}

}
