package oop_programming2;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleDataProcessingListExample {
	
	 public static double calculateMean(ArrayList<Integer> scores) {
	     int sum = 0;
	     double mean;
	     for (int score : scores) {
	         sum += score;
	     }
	     mean = (double) sum / scores.size();
	     return mean;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> scores = new ArrayList<Integer>();

        /* Get score inputs using Scanner */
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        Integer integerObject = null;
        
        do {
            System.out.print("Enter a score (enter -1 to quit): ");
            userInput = sc.nextInt();
            if (userInput != -1) {
                scores.add(userInput);
            }
        } while (userInput != -1);

       
        
        
        System.out.println("Mean for scores: " + calculateMean(scores));
        
        sc.close();
	}

}
