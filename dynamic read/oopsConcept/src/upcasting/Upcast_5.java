package upcasting;
class H{
	int i=1;
}
class I extends H{
	int i=2;
}
class J extends H{
	int i=3;
}
public class Upcast_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H h=new I();
		System.out.println(h.i);
		H h1=new J();
		System.out.println(h.i);
	}

}
