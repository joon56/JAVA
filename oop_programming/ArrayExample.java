package oop_programming;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]  weekdays = new String[7];		// 인덱스가 7개밖에 없어서 수기로 입력해줍니다.
		
		weekdays[0] = "Monday";
		weekdays[1] = "Tuesday";
		weekdays[2] = "Wednesday";
		weekdays[3] = "Thursday";
		weekdays[4] = "Friday";
		weekdays[5] = "Saturday";
		weekdays[6] = "Sunday";
		
		for(int i = 0; i < weekdays.length; i++) {	// weekdays의 크기만큼 for문을 돌려서 출력
			System.out.println(weekdays[i]);	// println 때문에 자동으로 줄바꿈 됩니다.
		}
		
	}

}
