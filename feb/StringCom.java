package feb;

public class StringCom {
	public static void main(String[]args) {
		String str1="Thangavi";
		String str2="Thangavi";
		String str3=new String("Thangavi");
		String str4=new String("Swathi");
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
	}

}
