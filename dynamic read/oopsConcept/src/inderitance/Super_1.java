package inderitance;
class E{
	int i;
	public void m2() {
	i=0;
}
}
class E1 extends E{
	public void m1() {
		//m2();
		System.out.println(this.i);
		System.out.println("m1 is executed");
	}
}
public class Super_1 {
	public static void main(String[]args) {
		E1 e=new E1();
		e.m1();
		//E r=new E();
		//r.m2();
		
	}

}

