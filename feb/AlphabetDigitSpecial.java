package feb;

public class AlphabetDigitSpecial {
	public static void main(String[]args) {
		char ch='s';
		if(ch>='a' && ch<='z') {
			System.out.println("The given value is alphabet");
		}else if(ch>='0' && ch<='9') {
			System.out.println("The given value is digits");
		}else {
			System.out.println("The given value is special character");
		}
	}

}
