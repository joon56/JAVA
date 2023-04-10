package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 10; i <= 50; i += 10) {
			list.add(i);
		}
		System.out.println(list);
		
		
		// 1. 일반 for문 : 인덱스로 반복 수행
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		// 2. for-each문 : 요소르 하나씩 대입하면서 반복
		// 주로 인덱스가 없는 구조에서 유용
		
		for(int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 3. iterator : 순환자, 반복자
		// 콜렉션을 순환하는 커서
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {	// hasNext() : 커서를 움직이지 않고 다음 요소가 있는지 판단
			int n = it.next();  // next() : 커서를 움직여서 다음 값을 바라보게 함
			
			System.out.println("n = " + n);
		}
		// 이동한 커서는 다시 돌아오지 않음
		System.out.println("it 다음? " + it.hasNext());
		
		
		
		
	}

}
