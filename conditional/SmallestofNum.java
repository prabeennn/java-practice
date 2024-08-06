class SmallestofNum
{
	public static void main(String[]args)
	{
		int a = 23;
		int b = 34;
		int c = 12;
		if(a<b && a<c)
		{
			System.out.println(a+ "smaller then" +b+" & " +c);
		}
		else if(b<c)
		{
			System.out.println(b+ "smaller then" +a+" & "+c);
		}
		else
		{
			System.out.println(c+ "smaller then" +a+" & "+b);
		}
	}
}