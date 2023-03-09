package feb;

public class ForOddEven {
	
		    public static void main(String[]args){
		        long a=12345679l;
		        int evencount=0;
		        int oddcount=1;
		        for(int i=1;i<=a;i++){
		            if(i%2==0){
		                evencount++;
		            }else{
		                oddcount++;
		            }
		            a=a/10;
		        }
		     System.out.println(evencount);
		     System.out.println(oddcount);
		    
		    }
		
	}


