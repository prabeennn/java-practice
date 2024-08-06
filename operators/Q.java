class Q
{
	public static void main(String[]args)
	{
		int a = 20;
		int b = a*=3;
		System.out.println(a+" "+b);
		boolean res1= a==b;
		boolean res2= --a < b++;
		boolean res3 = res1 == !res2;
		boolean res4 = (res1 != res2 && !(res3)||(!res1));
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}