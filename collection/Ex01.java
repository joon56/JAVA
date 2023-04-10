package collection;

import java.util.ArrayList;

// collection framework : �ڹٿ��� �����ϴ� �ڷᱸ��  �˰���

//����
// 1. list : ���� �ٲٱ�, �ߺ�, ���� �� ���� -> �迭 ����ȣȯ
// 2. set : ���� �ٲٱ�, �ߺ�, ���� �� �ȵ����� �߰��� ������ ����
// 3. map : key�� value�� ���� - key�� �ȵǰ� value�� �ߺ��� �ȴ�

// �̰Ŵ� �� �������̽��� ��� + ������ ���� �ؾ���


public class Ex01 {

	public static void main(String[] args) {
		// list�� ������ Ŭ����
		// - ArrayList, LinkedList, Vector
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list);
		// - collection�� ��κ� toString�� override�Ǿ� �־ �ٷ� ����ϸ� �ȴ�
		
		// list.add�ϸ� ������� �߰�
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		
		// add(�ε��� ��ȣ, ��) : �ش� �ε��� ��ġ�� �߰�
		list.add(1, 50);
		
		System.out.println(list);
		
		// set�� �߰��� �ƴ϶� ���� �ڸ��� �������
		list.set(2, 80);
		
		System.out.println(list);
		
		// list�� Ŭ������ get �޼���� ó���ؾ��� "[]" �� ��!!
		System.out.println("list[2] = " + list.get(2));
		
		// remove�� ���� ������ return ���� -> �� ���� ����
		list.remove(2);
		System.out.println(list);
		
		// size()�� ���� list�� ����� ���� ��ȯ
		System.out.println(list.size());
		
		// clear()�� list ��� ��ü ����
		
	}

}
