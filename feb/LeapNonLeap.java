package feb;

public class LeapNonLeap {
	public static void main(String[]args) {
		int year=2000;
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println("The given year is leap year");
			
		}else {
			System.out.println("The given number is not leap year");
		}
	}

}
