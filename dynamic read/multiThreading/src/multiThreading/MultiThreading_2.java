package multiThreading;


class T3 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("T3");
	}
	
}
public class MultiThreading_2 {

	public static void main(String[] args) {
		T3 t=new T3();
		Thread t1=new Thread(t);
		t1.start();
		T3 t2=new T3();
		Thread t3=new Thread(t2);
		t3.start();
		

	}

}
