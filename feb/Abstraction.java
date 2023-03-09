package feb;

public class Abstraction {
	public static void main(String[]args) {
		Audi a=new Audi();
		a.autostart();
		a.autostop();
		
	}

}
abstract class ShowRoom{
	 void autostart() {
		 System.out.println("Thangavi");
	 }
	abstract void autostop();
}
class Audi extends ShowRoom{
	//public void autostart() {
		//System.out.println("Audi-AutoStart");
	//}
	
	public void autostop(){
		System.out.println("Audi-AutoStop");
		
	}
}
class BMW extends ShowRoom{
	public void autostart() {
		System.out.println("BMW-AutoStart");
	}
	public void autostop() {
		System.out.println("BMW-AutoStop");
	}
}
