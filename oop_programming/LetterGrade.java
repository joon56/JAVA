package oop_programming;

public class LetterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double score = 85.6;
		
		if(score >= 90) {							// if-else���� ���ǿ� �������� AND�� ��� �����ݴϴ�.
			System.out.println("Grade : A");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("Grade : B");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("Grade : C");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("Grade : D");
		}
		else {
			System.out.println("Grade : F");
		}
	}

}
