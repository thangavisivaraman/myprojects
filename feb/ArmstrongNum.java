package feb;



public class ArmstrongNum {
	public static void main(String[]args) {
		
		int n =153;
		int n1=n;
		int arm=0;
		while(n>0) {
			int rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}if(n1==arm) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
	}

}
