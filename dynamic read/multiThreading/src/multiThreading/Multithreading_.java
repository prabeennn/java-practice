package multiThreading;




class T1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("T1 ="+i);
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
	
}
public class Multithreading_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		T1 t=new T1();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main ="+i);
		     Thread.sleep(800);
//		     T1 t1=new T1();
//				t1.start();
	}
	}
	

}
///// Check Multithreading_1 prog

