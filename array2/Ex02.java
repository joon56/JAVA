package array2;

public class Ex02 {

	public static void main(String[] args) {
		// 2���� �� �迭
		int[][] arr= new int[3][5];
		
		
		arr[1][3] = 10;
		arr[2][2] = 5;
		
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0;j < arr[i].length; j++) {
				System.out.printf("%2d", arr[i][j]);   // printf ���� %����d ���� �� ���ݸ�ŭ ���� ����ؼ� ���� ���߱� ������
			}
			System.out.println();
		}

	}

}
