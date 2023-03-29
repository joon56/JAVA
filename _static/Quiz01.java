package _static;

import other.Func;

public class Quiz01 {

	public static void main(String[] args) {
		// Math처럼 인스턴스 없이 구현가능한 클래스 만들어보기
		
		Func.printnumber(5);
		System.out.println();
		
		int sum = Func.total(5);
		System.out.println(sum);
		
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		Func.printarr(arr1);
		
		
	}

}
