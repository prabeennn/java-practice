class Demo
{
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<b && a<c)
		{
			System.out.println(a+ " is smallest number");
		}
		else if(b<c)
		{
			System.out.println(b+ " is the smallest number");
		}
		else
		{
			System.out.println(c+ " is smallest number");
		}
		
	}
}