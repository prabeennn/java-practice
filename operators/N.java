class N
{
	public static void main(String[]args)
	{
		int a=12;
		int b=a+6;
		System.out.println(a+" "+b);
		boolean res1=++a>=b;
		boolean res2=--b !=a;
		boolean res3=((res1!=res2 && res1)||(res1==res2));
		System.out.println(res3);
	}
}