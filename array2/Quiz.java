package array2;

public class Quiz {

	public static void main(String[] args) {
		
		int[][] arr = new int[8][8];
		
		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++ ) {
				
				arr[i][j] += n;
				n++;
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n");
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++ ) {
				
				
				System.out.printf("%4d", arr[j][i]);
			}
			System.out.println();
		}

	}

}
