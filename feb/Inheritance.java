package feb;

class Fashion{
	void myMeth1() {
		String ShopName="Hallow";
		int OfferTime=21032001;
		System.out.println(ShopName+" "+OfferTime);
		}
}
class Men extends Fashion{
	void myMeth2() {
		String DressType ="Tshirt";
		int DressRate=2000;
		System.out.println(DressType+" "+DressRate);
	}
}

public class Inheritance {
	public static void main(String[]args) {
		Men m1=new Men();
		m1.myMeth1();
		m1.myMeth2();
		
	}

}
