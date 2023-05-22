package oop_programming;

public class CalculateSum {

	public static int findSum(int n)		//�������� ���� ���� result�� �ϴ� �ʱ�ȭ�Ͽ� �����Ѵ�.
    {										//for���� ��Ȯ�� �Է��� n��ŭ ���鼭 1�� �����ϴ� i��ŭ �����ش�.
		int result = 0;						//i�� 1���� 1�� n�� ������ ������ �������� ������ �̵��� for���� �� �� ���� ������ result�� ��Ƽ� ���� �����Ѵ�.
		
		for(int i=1; i<=n; i++) {
			result += i;
		}
		
		return result;
    }


    public static void main(String[] args)
    {
        /* Find the sum from 1 to n using any loop statements
         * and print out the sum
         */
        
        System.out.println(findSum(100));       // 5050       
        System.out.println(findSum(1234));      // 761995  
        System.out.println(findSum(1000));      // 500500
    }

}
