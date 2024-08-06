package inderitance;

public class Block_ex_2 {
	static {
		System.out.println("static block-1");
		Block_ex_2 b2=new Block_ex_2(10);
	}
	{
		System.out.println("non-static-block-1");
	}
	Block_ex_2(){
		this(10);
		System.out.println("cons of demo no-arg");
	}
	Block_ex_2(int i){
		System.out.println("cons of demo arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Block_ex_2 b1=new Block_ex_2();
		System.out.println("main ends");
	}
	{
		System.out.println("non-static block-2");
	}
	static {
		System.out.println("static block-2");
	}

}
