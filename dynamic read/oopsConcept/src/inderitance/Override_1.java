package inderitance;
class AB{
	public void m1() {
		System.out.println("m1()-AB");
	}
}
class BC extends AB{
	
	@Override
	public void m1() {
		//super.m1();    // we can call the parent class method by using call to super
		System.out.println("m1()-BC");
		
	}
}
public class Override_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BC b=new BC();
		b.m1();
		//AB a=new AB(); //we have to create new object for calling method of AB
		//a.m1();      //or we call call by call to super method
	}

}
