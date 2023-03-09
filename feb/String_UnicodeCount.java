package feb;

public class String_UnicodeCount {
	public static void main(String[]args) {
		String name="ThangaviSivaraman";
		System.out.println("Original String is:"+name);
		int index=name.codePointCount(1, 9);
		System.out.println("The codePointCount of (1,9)is:"+index);
	}

}
