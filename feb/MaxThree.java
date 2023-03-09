package feb;

public class MaxThree {
	public static void main(String[]args) {
		int number1=100;
		int number2=200;
		int number3=300;
		if(number1>=number2 && number1>=number3) {
			System.out.println("Maximum number is: "+number1);
		}else if (number2>=number1 && number2>=number3) {
			System.out.println("Maximum number is: "+number2);
		}else {
			System.out.println("Maximum number is: "+number3);
		}
	}

}
