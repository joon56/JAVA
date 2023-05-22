package oop_programming;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번------------------------------------------------------------------
		String firstMessage = "Hello there.";
        String secondMessage = "I feel good.";
        
        System.out.println(firstMessage.concat(secondMessage)); //concat으로 문자열 붙이기
        
        // 2번----------------------------------------------------------------------
        String messageForConversion = "The quick brown fox jumps over the lazy dog.";
        System.out.println(messageForConversion.toUpperCase()); //toUpperCase로 모두 대문자로 만들기
        
        // 3번---------------------------------------------------------------------------
        String sentence = "Conditions worsen in Ukraine as war enters one year.";
        
        String[] arr = sentence.split(" ");		//새로운 문자열을 생성하여 여기에 split한 값을 담는다.
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
        }
	}

}
