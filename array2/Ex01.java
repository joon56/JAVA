package array2;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] arr2 = new int[][] {
			{ 10,20,30,40 },           // 0 행
			{ 11,21,31,41 },		   // 1 행
			{ 12,22,32,42 }			   // 2 행	
			// 0  1  2  3  열
	};
	
	System.out.println(Arrays.deepToString(arr2));
	System.out.println(arr2[0][1]);
	
		
	
	
	}

}
