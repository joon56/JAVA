package collection;

import java.util.Random;
import java.util.TreeSet;

public class Quiz01 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		// �׳� �����ϰ� �����ҰŸ� HashSet�ϸ� �ȴ�.
		
		while(lotto.size() != 6) {
			int n = ran.nextInt(45) + 1;
			
			lotto.add(n);
		}
		System.out.println("number = " + lotto);
	}

}
