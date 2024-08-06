package inderitance;

public class Block_ex {
	static {
		System.out.println("Static_block-1");
	}
	{
		System.out.println("non-static block-1");
	}
	Block_ex(){
		this(10);
		System.out.println("cons of demo-no-arg");
	}
	Block_ex(int i){
		System.out.println("cons of demo-arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Block_ex b=new Block_ex();
		System.out.println("main end");
	}
	{
		System.out.println("non-static block-2");
	}
	static {
		System.out.println("static block-2");
	}

}
