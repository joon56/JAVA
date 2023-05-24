package oop_programming2;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	public static int singleCubeRoll()
    {
        int number = (int)(Math.random() * 6) + 1;      

        return number;
    }
	
	public static int[] multipleRolls(int num)
    {
		int[] rolls = new int[num];
        for(int i = 0; i < num; i++) {
        	rolls[i] = singleCubeRoll();
        }
        return rolls;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("How many times do you want to roll a dice?: ");
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	     int[] diceNumbers = multipleRolls(n);
	     
	     System.out.println("### Dice numbers:");
	     for (int number: diceNumbers)
	     	{
	            System.out.println(number);
	        }
	     
	     sc.close();
	}

}
