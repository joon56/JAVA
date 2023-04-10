package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// set�� �ε����� ���� ������ �Ϲ� for���� ����� �� ����
		
		Random ran = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = ran.nextInt(5);		// 0 ~ n-1 ������ ���� �������� ����
		System.out.println(n);
		// ���� ��� 45 ~ 97������ ������ ���� ��������?
		// ran.nextInt(n) + 45 -> 0���ʹϱ� +45, �׸��� n + 45�� 98�� �ǰ� (0���Ͷ� -1�Ǵϱ�)
		
		
		for(int i = 0; i < 10; i++) {
			int p = (ran.nextInt(5) + 1) * 10;
			
			list.add(p);
		}
		
		System.out.println("list = " + list);
		
		// list -> set
		// �̰Ŵ� �ַ� list�� �ִ� �ߺ� �ɷ��� �� ��� ����
		// set���� �ٲ㼭 �ߺ��� �ɷ����� �ٽ� list�� �ٲٴ°� ��õ (set�� �ߺ�, ���� �ȵǴϱ�)
		// �����ڸ� ���� �����ϰ� ������
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		System.out.println("hs = " + hs);
		
		
		// set -> list
		list = new ArrayList<Integer>(hs);
		
		System.out.println("list = " + list);
		
		list.sort(null);  // sort�ϰ� null�ϸ� �⺻ Comparator�� ���� ������������ ����
		System.out.println("���� : " + list);
		
	}

}
