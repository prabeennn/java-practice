package upcasting;
class E{
	void run() {
		System.out.println();
	}
}
class F extends E{
	void dance() {
		
	}
}
class G extends E{
	void eat() {
		
	}
}
public class Upcast_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e=new F();
		e.run();
		//e.dance(); it is not possible in upcasting
		E e2=new G();
		e2.run();
		//e2.dance(); it is not possible in upcasting
		
	}

}
