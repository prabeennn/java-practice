package exceptionHandling;

public class Matrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =57;
		if(age>=25 && age<=30) {
			System.out.println("You are Eligible");
		}
		else {
			AgeIndexOutofBoundException a= new AgeIndexOutofBoundException();
			throw a;
		}

	}

}
