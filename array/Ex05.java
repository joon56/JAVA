package array;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		// �� �迭�� ���߿� ���� ���� �� ���
		
		String[] lang = new String[5];
		
		System.out.println(Arrays.toString(lang));
		
		lang[0] = "Java";
		lang[3] = "Python";
		
		System.out.println(Arrays.deepToString(lang));
	}

}
