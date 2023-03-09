package feb;

public class Method_Overriding {
	
		void payment() {
			System.out.println("Send money home,recharge mobile,shop online");
		}
		  
		  public static void main(String [] args ) {
			  GooglePay sc=new GooglePay();
			  sc.payment();
			  
	}
}
	 class GooglePay extends Method_Overriding{
		 void payment() {
			 System.out.println("Do direct bank to bank transfers");
		 }
	 }
	  class PayTM extends Method_Overriding{
		  void payment() {
			  System.out.println("QR code");
			  
		  }
		  

	  }
	  



