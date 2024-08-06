class K
{
	public static void main(String[]args)
	{
		int a = 10;
		int b =20;
		boolean result1=a<=b;
		boolean result2=a<b;
		boolean result3=(result1 && result2) && (result2!=result1);
		System.out.println(result3);
	}
}