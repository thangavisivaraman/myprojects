package feb;

public class Divisible {
	public static void main(String[]args) {
		int a=50;
		for(int i=1;i<=a;i++) {
			if(i%5==0 && i%10!=0) {
				System.out.println(i);
			}
		}
	}

}
