package inderitance;
class Bank{
	public int rateOfInt() {
		return 0;
	}
	
}
class ICICI extends Bank{
	@Override
	public int rateOfInt() {
		return 9;
	}
}
class Axis extends Bank{
	@Override
	public int rateOfInt() {
		return 5;
	}
}
class SBI extends Bank{
	
}
public class Override_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI i=new ICICI();
		//i.rateOfInt();
		Axis a=new Axis();
		//a.rateOfInt();
		SBI s=new SBI();
		//s.rateOfInt();
		System.out.println("ICICI Bank rate of int is :"+i.rateOfInt());
		System.out.println("Axis Bank rate of int is :"+a.rateOfInt());
		System.out.println("SBI Bank rate of int is :"+s.rateOfInt());
		

	}

}
