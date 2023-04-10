package collection;

import java.util.ArrayList;

// collection framework : 자바에서 제공하는 자료구조  알고리즘

//종류
// 1. list : 순서 바꾸기, 중복, 수정 다 혀용 -> 배열 상위호환
// 2. set : 순서 바꾸기, 중복, 수정 다 안되지만 추가나 삭제는 가능
// 3. map : key와 value의 구성 - key는 안되고 value는 중복이 된다

// 이거는 다 인터페이스라서 상속 + 구현을 직접 해야함


public class Ex01 {

	public static void main(String[] args) {
		// list를 구현한 클래스
		// - ArrayList, LinkedList, Vector
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list);
		// - collection은 대부분 toString이 override되어 있어서 바로 출력하면 된다
		
		// list.add하면 순서대로 추가
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		
		// add(인덱스 번호, 값) : 해당 인덱스 위치에 추가
		list.add(1, 50);
		
		System.out.println(list);
		
		// set은 추가가 아니라 값을 자리에 덮어쓰기함
		list.set(2, 80);
		
		System.out.println(list);
		
		// list는 클래스라서 get 메서드로 처리해야함 "[]" 못 씀!!
		System.out.println("list[2] = " + list.get(2));
		
		// remove는 값을 꺼내서 return 받음 -> 그 값만 삭제
		list.remove(2);
		System.out.println(list);
		
		// size()는 현재 list의 요소의 개수 반환
		System.out.println(list.size());
		
		// clear()는 list 요소 전체 삭제
		
	}

}
