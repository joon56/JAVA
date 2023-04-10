package collection;

import java.util.Random;
import java.util.TreeSet;

public class Quiz01 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		// 그냥 랜덤하게 정렬할거면 HashSet하면 된다.
		
		while(lotto.size() != 6) {
			int n = ran.nextInt(45) + 1;
			
			lotto.add(n);
		}
		System.out.println("number = " + lotto);
	}

}
