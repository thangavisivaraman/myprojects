package feb;
class Bike{
	Bike(){
		System.out.println("Thangavi");
	}
}
class Met{
	Met(){
		System.out.println("Swathi");
	}
}
class Road{
	Road(String name,int id){
		System.out.println(name+" "+id);
		
	}
}
public class Constructor {
	Constructor(){
		System.out.println("Java");
	}
	public static void main(String[]args) {
		//new Constructor();
		Road sc=new Road("Thangavi",1234);
		
		
	}

}
