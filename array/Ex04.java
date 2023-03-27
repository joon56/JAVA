package array;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		// 빈 배열은 쓰레기 값이 아니라 각 타입의 기본값이 채워진다
		
		boolean[] bos = new boolean[3];
		char[] chs = new char[3];
		int[] its = new int[3];
		double[] dbs = new double[3];
		
		String[] sgs = new String[3];
		
		System.out.println(Arrays.toString(bos));
		System.out.println(Arrays.toString(chs));
		System.out.println(Arrays.toString(its));
		System.out.println(Arrays.toString(dbs));
		System.out.println(Arrays.toString(sgs));
		

	}

}
