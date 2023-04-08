package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {

	public static void main(String[] args) {
		String [] lang = new String[] { "Java", "Python", "C++", "SQL" };
		
		System.out.println("���� �� : " + Arrays.toString(lang));
		
		Comparator<String> asc = (String o1, String o2) ->  {
			return o1.compareTo(o2);	// o1 - o2 �� ��������
		};
		
		Arrays.sort(lang, asc);
		
		System.out.println(Arrays.toString(lang));
		
		Arrays.sort(lang, (String o1, String o2) -> o2.compareTo(o1));
		
		System.out.println(Arrays.toString(lang));

	}

}
