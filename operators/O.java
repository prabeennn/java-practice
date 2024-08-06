class O
{
	public static void main(String[]args)
	{
		int a=30;
		int b=a+5;
		System.out.println(a+" "+b);
		boolean res1=a++  ==b;
		boolean res2=++a < --b;
		boolean res3=((res1 == res2 && res2) || (res1 ==res2));
		System.out.println(res3);
	}
}