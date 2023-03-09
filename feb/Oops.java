package feb;

public class Oops {

	String mobileName = "samsung";
	String mobileModel = "j2core";

	public void Mobileappinstalled() {
		System.out.println("Installed");
	}

	public void Setting() {
		System.out.println("Settings enabled");
	}
	
	

}

class MobileAppStore {
	public static void main(String[] args) {
		System.out.println("Main function");
		Oops sc = new Oops();
		sc.Mobileappinstalled();
		sc.Setting();
		System.out.println(sc.mobileName);
		System.out.println(sc.mobileModel);
		
	}
}
