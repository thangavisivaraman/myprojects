package feb;

public class Method {
	public void myMethod() {
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void myMethod2() {
		 String name="Thangavi Sivaraman";
		 System.out.println(name);
	 }
	   public int myMethod3(){
		   int s=2;
		   int d=3;
		   int sum=s+d;
		   return sum;
		 
	 }
	   public void myMethod4(int m,int n) {
		   int sum=m+n;
		   System.out.println(sum);
		   }
public static void main(String[]args){
	Method sc=new Method();
	sc.myMethod();
	myMethod2();
	int result=sc.myMethod3();
	
	System.out.println(result);
	sc.myMethod4(2,1);
	
}
}
