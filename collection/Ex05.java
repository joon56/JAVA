package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// set은 인덱스가 없기 때문에 일반 for문을 사용할 수 없다
		
		Random ran = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = ran.nextInt(5);		// 0 ~ n-1 까지의 수가 무작위로 나옴
		System.out.println(n);
		// 예를 들어 45 ~ 97까지의 랜덤한 수를 뽑으려면?
		// ran.nextInt(n) + 45 -> 0부터니까 +45, 그리고 n + 45가 98이 되게 (0부터라서 -1되니까)
		
		
		for(int i = 0; i < 10; i++) {
			int p = (ran.nextInt(5) + 1) * 10;
			
			list.add(p);
		}
		
		System.out.println("list = " + list);
		
		// list -> set
		// 이거는 주로 list에 있는 중복 걸러낼 때 계속 쓰임
		// set으로 바꿔서 중복만 걸러내고 다시 list로 바꾸는거 추천 (set은 중복, 수정 안되니까)
		// 생성자를 쓰면 수월하게 가능함
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		System.out.println("hs = " + hs);
		
		
		// set -> list
		list = new ArrayList<Integer>(hs);
		
		System.out.println("list = " + list);
		
		list.sort(null);  // sort하고 null하면 기본 Comparator로 들어가서 오름차순으로 정렬
		System.out.println("정렬 : " + list);
		
	}

}
