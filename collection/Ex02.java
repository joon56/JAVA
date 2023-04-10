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
		
		
		// 1. �Ϲ� for�� : �ε����� �ݺ� ����
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		// 2. for-each�� : ��Ҹ� �ϳ��� �����ϸ鼭 �ݺ�
		// �ַ� �ε����� ���� �������� ����
		
		for(int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 3. iterator : ��ȯ��, �ݺ���
		// �ݷ����� ��ȯ�ϴ� Ŀ��
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {	// hasNext() : Ŀ���� �������� �ʰ� ���� ��Ұ� �ִ��� �Ǵ�
			int n = it.next();  // next() : Ŀ���� �������� ���� ���� �ٶ󺸰� ��
			
			System.out.println("n = " + n);
		}
		// �̵��� Ŀ���� �ٽ� ���ƿ��� ����
		System.out.println("it ����? " + it.hasNext());
		
		
		
		
	}

}
