package feb;

public class Method_Constructor {
	int a;
	int b;
	Method_Constructor(int num1,int num2){
		a=num1;
		b=num2;
	}
	int myMeth1() {
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	int myMeth2() {
		int sum=a-b;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[]args) {
		Method_Constructor sc=new Method_Constructor(1,2);
		sc.myMeth1();
		sc.myMeth2();
	}

}
