package oop_programming;

public class CalculateSum {

	public static int findSum(int n)		//최종값을 담을 변수 result를 일단 초기화하여 생성한다.
    {										//for문을 정확히 입력한 n만큼 돌면서 1씩 증가하는 i만큼 더해준다.
		int result = 0;						//i는 1부터 1씩 n과 같아질 때까지 더해지기 때문에 이들을 for문을 한 번 지날 때마다 result에 담아서 합을 저장한다.
		
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
