package feb;

public class RevForLoop {
	public static void main(String[]args) {
		int a=123456789;
		int b=0;
		for(int i=a;i!=0;i/=10) {
			b=b*10+i%10;
		}
		System.out.println(b);
	}

}
