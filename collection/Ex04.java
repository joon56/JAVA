package collection;

import java.util.HashSet;

public class Ex04 {

	public static void main(String[] args) {
		//set : 순서, 중복x
		
		// 구현 클래스
		// - HashSet, TreeSet
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);	// 중복된 값은 무시함
		
		//hs.get(1)는 set에는 인덱스라는  개념이 없어 순서가 의미가 없음 
		
		System.out.println(hs);
		
		hs.remove(10);
		// 인덱스가 없기 때문에 값 자체를 입력하고 그걸 지움
	}

}
