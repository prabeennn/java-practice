package inderitance;
class X{
	int i;
	X(int i){
		this.i=i;
	}
}
public class Refrence_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=new X(12);
		X x1=x;
		X x2=x1;
		System.out.println(x1.i);
		x1.i=21;
		System.out.println(x.i);
		System.out.println(x2.i);
		System.out.println(x1.i);
	}

}
