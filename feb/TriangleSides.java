package feb;

public class TriangleSides {
	public static void main(String[]args) {
		int angle1=60;
		int angle2=60;
		int angle3=60;
		int sum=angle1+angle2+angle3;
		if(sum==180 && angle1>0 && angle2>0 && angle3>0) {
			System.out.println("Triangle is valid");
		}else {
			System.out.println("Triangle is invalid");
		}
	}

}
