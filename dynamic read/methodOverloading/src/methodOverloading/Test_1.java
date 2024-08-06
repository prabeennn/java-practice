package methodOverloading;
class Perween {
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}

}

public class Test_1 {
	public static void main(String[]args)
	{
		Perween a1=new Perween();
		a1.add(10,20);
		a1.add(10,20,30);
	}

}
