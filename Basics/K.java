class K
{
	static int i = 0;
	public static void main(String[]args){
	m1();
	K.i=20;
	m1();
	}
	public static void m1(){
		System.out.println("m1 starts");
		System.out.println(K.i);
		System.out.println("m1 ends");
	}
}