package feb;

public class String_Unicode {
	public static void main(String[]args) {
		String name="THANGAVI";
		System.out.println("Orignal String is:"+name);
		int index1=name.codePointAt(0);
		int index2=name.codePointAt(4);
		System.out.println("The position of codePointAt(0) is:"+index1);
		System.out.println("The position of codePointAt(4) is:"+index2);
		
	}

}
