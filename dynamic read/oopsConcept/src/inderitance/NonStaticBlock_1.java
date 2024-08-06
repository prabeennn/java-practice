package inderitance;

public class NonStaticBlock_1 {
static int i;
int j;
{
	i=10;
	j=20;
}
{
	j=i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		NonStaticBlock_1 n=new NonStaticBlock_1();
		System.out.println(n.i+" "+n.j);
		System.out.println("main ends");
	}
//	{
//		int i=this.i;
//		int j=this.j;
//		this.i=i;
//		this.j=j;
//	}

}
