class C
{
	static int i;
	int j;
	public static void main(String[]args)
	{
		C e1 = new C();
		C e2 = new C();
		e1.j = 34;
		e2.j = 76;
		System.out.println(e1.j);
		System.out.println(e2.j);
		
		e1.i = 34;
		e1.i = 65;
		System.out.println(e1.i);
		System.out.println(e1.i);
	}
}