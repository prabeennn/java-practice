class I
{
	public static void main(String[]args)
	{
		int a = 23;
		int b = a*2;
		int c = b;
		System.out.println(c);
		c=a++ + --a + ++b + --b + c;
		System.out.println(a+" "+b+" "+c);
	}
}