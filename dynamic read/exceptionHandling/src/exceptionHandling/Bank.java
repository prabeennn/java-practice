package exceptionHandling;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account(5000);
		try {
			a.withdraw(50000);
		}
		catch(InsufficientBalException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Available Balance = "+a.getBal());
	}

}
