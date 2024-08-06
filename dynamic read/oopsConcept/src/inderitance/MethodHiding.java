package inderitance;
class AS{
	public static void m1() {
		System.out.println("m1()-AS");
	}
}
class AD extends AS{
	public static void m1() {
		//super.m1();         // super is not possible in static method
		System.out.println("m1()-AD");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AD a=new AD();
		a.m1();
	}

}
