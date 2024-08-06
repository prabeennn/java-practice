class marriage
{
	public static void main(String[]args)
	{
		int age = 17;
		int sal = 50000;
		if(age>=25)
		{
			if(age<=35)
			{
				if(sal>=40000)
				{
					System.out.println("Eligible for marriage :)");
				}
				else
				{
					System.out.println(" Waiting list...:|");
				}
			}		
			else
			{
				System.out.println(" We will get back you soon....:(");
			}
		}
		else
		{
			System.out.println(" You are not matching the age(18+)");
		}
	}
}