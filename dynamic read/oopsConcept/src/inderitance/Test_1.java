package inderitance;
class Z{
	public static void m1(A a)
	{
		System.out.println("m1 of b");
	}
}
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z=new Z();
		//A a=new A();
		z.m1(new A());
		//z.m1(a);
	}

}
