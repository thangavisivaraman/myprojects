package feb;

import java.util.Scanner;

public class CountIntegers {
    public static void main(String[] args) {
		/*
		 * int a=1234564; int count=1; for(int i=0;i<=a;i++){ a=a/10; count++; }
		 * System.out.println(count);
		 */
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
    	int n=sc.nextInt();
    	
    	if(n%3==0 && n%5==0) {
    		System.out.println("three five");
    		}else if(n%5==0) {
    			System.out.println("five");
    		}else if(n%3==0 ) {
    			System.out.println("three");
    		}else {
    			System.out.println("not divisible");
    		}
    		
    	}
    } 
