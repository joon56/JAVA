package oop_programming;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 13; i++) {		//총 #이 12줄이기 때문에 이에 맞춰 for문으로 12번 반복한다.
			for(int j = 12; j > 0; j--) {
				if(i < j) {
					System.out.print(" "); //우측 배열으로 치우쳐져있기 때문에 조건에 따라 공백을 먼저 출력한다.
				}else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}

}
