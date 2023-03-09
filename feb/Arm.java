package feb;

public class Arm {
	public static void main(String[]args) {
	for(int i=0;i<=1000;i++) {
		int num =i;
		int sum=0;
	while(num>0) {
		int last=num%10;
		sum=sum+(last*last*last);
		num=num/10;
		
	}
	if(i==sum) {
		System.out.println(i + "ArmStrong Number");
	}
	}
	}
}
	
	
