class J
{
	static int i = 20;
	public static void main(String[]args)
	{
		System.out.println(J.i);
		J.i = 30;
		System.out.println(J.i);
		J.i = 40;
		System.out.println(J.i);
	}
}