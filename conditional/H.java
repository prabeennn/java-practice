class H
{
	public static void main(String[]args)
	{
		int a = 51;
		if(--a%5==0 && a%10==0)
		{
			System.out.println(a+" is divisible by 5 and 10");
		}
		else
		{
			System.out.println(a+" is not divisible by 5 and 10");
		}
	}
}