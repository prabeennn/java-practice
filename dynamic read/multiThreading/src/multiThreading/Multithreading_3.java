package multiThreading;

class A extends Thread{
	@Override
	public void run() {
		System.out.println("hii");
		
	}
	public void cat() {
		System.out.println("afsfsf");
	}
}
class B extends A{
	@Override
	public void run() {
		System.out.println("hello");
		
	}
	public void cat() {
		System.out.println("bdfjbe");
	}
}
public class Multithreading_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.start();
		b.sleep(1000);
		//b.cat();
		A a=new B();
		a.start();
		b.sleep(1000);
		//a.cat();
		A a1=new A();
		a1.start();//a1.cat();
		b.sleep(1000);
		

	}

}
