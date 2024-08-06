package exceptionHandling;

public class Account {

	
		private int bal;
		
		public Account(int bal) {
			this.bal=bal;

	}
		public int getBal() {
			return bal;
		}
		public void withdraw(int amount) throws InsufficientBalException{
			if(amount>bal) {
				InsufficientBalException a=new InsufficientBalException("Insufficient Bal");
				throw a;
			}
			bal-=amount;
		}

}
