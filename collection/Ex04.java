package collection;

import java.util.HashSet;

public class Ex04 {

	public static void main(String[] args) {
		//set : ����, �ߺ�x
		
		// ���� Ŭ����
		// - HashSet, TreeSet
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);	// �ߺ��� ���� ������
		
		//hs.get(1)�� set���� �ε������  ������ ���� ������ �ǹ̰� ���� 
		
		System.out.println(hs);
		
		hs.remove(10);
		// �ε����� ���� ������ �� ��ü�� �Է��ϰ� �װ� ����
	}

}
