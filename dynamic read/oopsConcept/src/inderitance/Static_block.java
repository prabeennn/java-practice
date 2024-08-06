package inderitance;

public class Static_block {
	static{
		System.out.println("Static block-1");
	}
	static {
		System.out.println("static block-3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		System.out.println("main ends");
	}
	static
	{
		System.out.println("Static block-2");
	}

}
