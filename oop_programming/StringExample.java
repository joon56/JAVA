package oop_programming;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1��------------------------------------------------------------------
		String firstMessage = "Hello there.";
        String secondMessage = "I feel good.";
        
        System.out.println(firstMessage.concat(secondMessage)); //concat���� ���ڿ� ���̱�
        
        // 2��----------------------------------------------------------------------
        String messageForConversion = "The quick brown fox jumps over the lazy dog.";
        System.out.println(messageForConversion.toUpperCase()); //toUpperCase�� ��� �빮�ڷ� �����
        
        // 3��---------------------------------------------------------------------------
        String sentence = "Conditions worsen in Ukraine as war enters one year.";
        
        String[] arr = sentence.split(" ");		//���ο� ���ڿ��� �����Ͽ� ���⿡ split�� ���� ��´�.
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
        }
	}

}
