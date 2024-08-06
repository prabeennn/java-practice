package inderitance;
class AA{
	static {
		System.out.println("Static block of AA");
	}
	{
		System.out.println("Non-static block of  AA");
	}
	{
		System.out.println("non static block");
	}
	AA(){
		System.out.println("cons of AA");
	}
}
class BB extends AA{
	static {
		System.out.println("Static block of BB");
	}
	{
		System.out.println("non-static block of BB");
	}
	BB(){
		System.out.println("cons of BB");
	}
}
public class Super_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b=new BB();
	}

}
