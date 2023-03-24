package loop2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// for문 별출력
		
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
		         
		        // do while 반복문으로 짝수면서 0이
		        // 아닐 때 재입력 할수 있게 만든 루프다.
		do {
			System.out.print("출력 할 줄 수 입력(종료하려면 '0'입력) : ");
			a = sc.nextInt();
			}while(a %2 == 0 && a != 0);
		         
		        // if 조건문으로 0일때 종료되고 이외일 때 별찍기 실행
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
		 System.out.print("출력할 줄 수 입력 : ");
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
