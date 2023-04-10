package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex06 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i <= 50; i++) {
			hs.add(i);
		}
		
		System.out.println("hs = " + hs);
		
		// 1. for-each
		for(int n : hs) {
			System.out.println("n = " + n);
		}
		
		// 2. iterator
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			
			System.out.println("n = " + n);
		}
		
		
	}

}
