package array2;

public class Ex02 {

	public static void main(String[] args) {
		// 2차원 빈 배열
		int[][] arr= new int[3][5];
		
		
		arr[1][3] = 10;
		arr[2][2] = 5;
		
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0;j < arr[i].length; j++) {
				System.out.printf("%2d", arr[i][j]);   // printf 쓰고 %숫자d 쓰면 그 간격만큼 띄우고 출력해서 간격 맞추기 수월함
			}
			System.out.println();
		}

	}

}
