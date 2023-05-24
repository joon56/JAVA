package oop_programming2;

public class Factorial {
	
	public static long factorial(int num)
    {
		if (num == 0) {
	        return 1;
	    } else {
	        return num * factorial(num-1);
	    }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("10! = " + factorial(10));
	     System.out.println("20! = " + factorial(20));
	}

}
