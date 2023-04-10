package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex07 {

	public static void main(String[] args) {
		// Tree

		TreeSet<Integer> tree = new TreeSet<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		Random ran = new Random();

		for (int i = 0; i < 10; i++) {
			int n = ran.nextInt(10) + 1;

			hs.add(n);
			tree.add(n);
		}

		System.out.println("hs = " + hs);
		System.out.println("tree = " + tree);
	}

}
