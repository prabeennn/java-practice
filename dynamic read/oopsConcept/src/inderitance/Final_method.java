package inderitance;
class QW{
	public void m1() {
		System.out.println("m1()-QW");
	}
}
class WQ extends QW{
	@Override
	public final void m1() {
		
		System.out.println("m1()-WQ");
	}
}
class WE extends QW{
	@Override				// if there is no method in this it will call parent class method
	public void m1() {
		System.out.println("m1()-WE");
	}
}
public class Final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WE w=new WE();
		w.m1();
		WQ w1=new WQ();
		w1.m1();
	}

}
