package feb;
class Work{
	String empname;
	int empid; 
	Work(){
		System.out.println("Working time");	
		empname="Thangavi";
		empid=2103;
		}
	//Work(String name,int num){
		//empname=name;
		//empid=num;
		
	//}

void myMeth() {
	System.out.println("Employee name is:"+empname);
	System.out.println("Employee id is:"+empid);
	
}
}

public class Employee {
	public static void main(String[]args) {
		//new Work();
		Work s1=new Work();
		s1.myMeth();
		//new Work("Thangavi",2103);
		
	}

}
