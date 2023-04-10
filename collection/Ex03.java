package collection;

import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {
		// ArratList나 LinkedList는 사용방법은 똑같음
		// 그러나 저장하는 내부구조가 다르다
		
		// ArrayList : 배열 기반으로 작성, 속도는 빠르나 수정시에 오버헤드 발생 가능함
		// LinkedKist : ArrayList보다는 느리지만 추가, 제거시 오버헤드가 발생x
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
	}

}
