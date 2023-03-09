package feb;

public class StringCompareTo {
	
	    public static void main(String[]args){
	        String str1="THANGAVI";
	        String str2="THANGAVI";
	        System.out.println("Original String is:"+str1);
	        System.out.println("Original String is:"+str2);
	        int index=str1.compareTo(str2);
	        if(index<0){
	            System.out.println("String1 is less than to String2");
	        }else if(index==0){
	            System.out.println("String1 is equal to String2");
	        }else{
	            System.out.println("String1 is greater than String2");
	        }
	        }
	        }


