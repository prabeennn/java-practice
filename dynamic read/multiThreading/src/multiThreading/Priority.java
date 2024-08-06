package multiThreading;

class MyThread_1 extends Thread{
	
}
public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread_1 m=new MyThread_1();
		System.out.println(m.getPriority());
		System.out.println(m.getName());
		m.setPriority(10);
		m.setName("child thred");
		System.out.println(m.getPriority());
		
		Thread.currentThread().setName("main threAD");
		System.out.println(m.getName());
		System.out.println(Thread.currentThread().getName());
		
	}

}
