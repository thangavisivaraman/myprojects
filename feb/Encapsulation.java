package feb;

public class Encapsulation {
	public static void main(String[]args) {
		Rent r1=new Rent();
     System.out.println(r1.getbankBalance());
     Rent r2=new Rent();
     System.out.println(r2.getbankBalance());
}
}

	class Rent{
		
		private float bankBalance=1000.0f;
		public float getbankBalance() {
			return bankBalance;
		}
		public float setbankBalance(float bankBalance) {
			this.bankBalance=bankBalance;
		}
	}
 
