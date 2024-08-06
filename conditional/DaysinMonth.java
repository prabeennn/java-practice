class DaysinMonth
{
	public static void main(String[]args)
	{
		int year = 2023;
		int month = 4;
		switch(month)
		{
			case1:
			case3:
			case5:
			case7:
			case8:
			case10:
			case12:{
				System.out.println("31 days in this month");
			}
			break;
			
			case4:
			case6:
			case9:
			case11:{
				System.out.println("30 days in this month");
			}
			break;
	
			case2:{
				if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
				
					System.out.println("29 days in this month");
				
				else
				
					System.out.println("28 days in this month);
				
			      }
			break;
			default : System.out.println("enter valid year");
		}
	}
}