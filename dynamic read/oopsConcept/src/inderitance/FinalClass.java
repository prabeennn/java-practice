package inderitance;
class SS{
	public  void m1() {
		System.out.println("m1()-SS");
	}
}
 final class DD extends SS{
	 public void m1() {
		 System.out.println("m1()-DD");
	 }
 }
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DD d=new DD();
		d.m1();
		//SS s=new SS();
		//s.m1();
	}

}
