class L
{
	public static void main(String[]args) 
	{
		int a=36;
		int b=12;

		boolean res1 = a>b;
		boolean res2 = a==b;
		boolean res3 = (res1 && res2);
		boolean res4 = (res1 && res3);
		boolean res5 = (res1 && res2) && (res2 && res4);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
	}
}