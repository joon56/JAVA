package oop_programming2;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionAbstractionExample {
	
	public static double calculateMean(ArrayList<Integer> scores) {
	     int sum = 0;
	     double mean;
	     for (int score : scores) {
	         sum += score;
	     }
	     mean = (double) sum / scores.size();
	     return mean;
	 }
	
	public static ArrayList<Integer> getScoresUntilDone() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> total_scores = new ArrayList<Integer>();

        int score;
        do {
            System.out.print("Score input? (-1 to quit): ");
            score = sc.nextInt();
            if (score != -1) {
                total_scores.add(score);
            }
        } while (score != -1);
        
        sc.close();
        return total_scores;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> scores = getScoresUntilDone();
        System.out.println("Mean for scores: " + calculateMean(scores));
        
        
	}
	
}
