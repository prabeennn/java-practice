package inderitance;

public class NonStaticBlock {
	{
		System.out.println("non static block-1");
	}
	{
		System.out.println("non static block-2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		NonStaticBlock n= new NonStaticBlock();
		NonStaticBlock n1=new NonStaticBlock();
		System.out.println("main ends");
	}
	{
		System.out.println("non static block-3");
	}
	

}
