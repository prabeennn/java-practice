package inderitance;
class F{
	F(){
		System.out.println("constructor of f");
	}
	F(int a){
		System.out.println("argument of f");
	}
}
class F1 extends F{
	F1(int b){
		//super(10);
		System.out.println("arg of f1");
	}
	F1(){
		System.out.println("htfht");
	}
}
class F2 extends F1{
	F2(){
		super(20);
		System.out.println("args of f2");
	}
//	F2(){
//		System.out.println("cons");
//	}
}
public class Super_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F2 f=new F2();
		

	}

}
