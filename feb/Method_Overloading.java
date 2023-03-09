package feb;

public class Method_Overloading {
	int a;
	int b;
	void myMeth1(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	void myMeth1(float a,float b) {
		float sum=a-b;
		System.out.println(sum);
	}
	public static void main(String[]args) {
		Method_Overloading sc=new Method_Overloading();
		sc.myMeth1(10,20);
		sc.myMeth1(20.0f,40.0f);
	
	}

}
