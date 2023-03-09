package feb;

public class Polymorphism {
	public static void main(String[]args) {
		Teacher obj=new Teacher();
		obj.display();
		//Teacher s1=new Teacher();
		//s1.display();
		
	}

}
class Watch{
	public void display() {
		System.out.println("Hello World");
	}
}
class Teacher extends Watch{
	//public void display() {
		//System.out.println("Welcome");
	//}
}
