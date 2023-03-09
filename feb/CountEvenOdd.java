package feb;

public class CountEvenOdd {
	public static void main(String[] args) {
	        
	        int num=12345;
	        int evenCount = 0, oddCount = 0;
	        
	        while(num!=0) {
	            int digit = num % 10;
	            if (digit % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	            num /= 10;
	        }
	        
	        System.out.println("Number of even digits: " + evenCount);
	        System.out.println("Number of odd digits: " + oddCount);
	    }
	}





