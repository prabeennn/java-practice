class J
{
	public static void main(String[]args)
	{
		int a = 87;
		if(a>=0 && a<=9)
		{
			System.out.println(a+"  is single digit");
		}
		else if(a>=10 && a<=99)
		{
			System.out.println(a+" is double digit");
		}
		else
		{
			System.out.println(a+" is more then two digit");
		}
	}
}	