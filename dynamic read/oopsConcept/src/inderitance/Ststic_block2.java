package inderitance;

public class Ststic_block2 {
static int i;
static {
	int j=30;
	i=j;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println(i);
		}
		System.out.println(i);
	}

}
