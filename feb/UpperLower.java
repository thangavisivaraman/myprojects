package feb;

public class UpperLower {
	public static void main(String[]args) {
		char ch='k';
		if(ch>='A'&& ch<='Z') {
			System.out.println("The given alphabet character is Uppercase ");
		}else if(ch>='a' && ch<='z') {
			System.out.println("The given alphabet character is lowercase");
		}else {
			System.out.println("Enter the validate character");
		}
	}

}
