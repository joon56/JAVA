package loop2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// for�� �����
		
		// ---------------------------------------------
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		// ---------------------------------------------
		
		for (int i = 0; i < 6; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		// ---------------------------------------------
		
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		// ---------------------------------------------
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		// ---------------------------------------------
		   
		Scanner sc = new Scanner(System.in);
		         
		int a, b, c, d;
		         
		        // do while �ݺ������� ¦���鼭 0��
		        // �ƴ� �� ���Է� �Ҽ� �ְ� ���� ������.
		do {
			System.out.print("��� �� �� �� �Է�(�����Ϸ��� '0'�Է�) : ");
			a = sc.nextInt();
			}while(a %2 == 0 && a != 0);
		         
		        // if ���ǹ����� 0�϶� ����ǰ� �̿��� �� ����� ����
		if(a == 0) {
			System.out.print("");
		}
		else {
			b = (a+1)/2;
			c = d = b;         
			System.out.println();
			for(int i = 1; i <= a; i++) {
				for(int j = 1; j <= d; j++) {
					if(j < c) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
				if(i < b) { 
					c--; 
					d++; 
				}
				else { 
					c++; 
					d--; 
				}
			}
		}            
		
		System.out.println("\n");
		// ---------------------------------------------
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j | i + j == 4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		// ----------------------------------------------
		
		int line;
		 System.out.print("����� �� �� �Է� : ");
	        line = sc.nextInt();
	        
	        for(int i=0, add=line-1; i<line; i++, add--) {
	            for(int j=0; j<i; j++) {
	                System.out.print(" ");
	            }
	            for(int j=0; j<line-i+add; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    System.out.println("\n");
	    // ----------------------------------------------
	    
	    int z = 13;
	    for(int i=1; i<=z/2; i++){
	      for(int j=0; j<i; j++) 
	    	  System.out.print("*");
	      for(int j=0; j<z-2*i; j++) 
	    	  System.out.print(" ");
	      for(int j=0; j<i; j++) 
	    	  System.out.print("*");
	      System.out.println();
	    }
	    for(int i=0; i<z; i++){
	      System.out.print("*");
	    }
	    System.out.println();
	    for(int i=1; i<=z/2; i++){
	      for(int j=0; j<z/2-i+1; j++) 
	    	  System.out.print("*");
	      for(int j=0; j<i*2-1; j++) 
	    	  System.out.print(" ");
	      for(int j=0; j<z/2-i+1; j++) 
	    	  System.out.print("*");
	      System.out.println();
	    }
	
		sc.close();

	}

}
