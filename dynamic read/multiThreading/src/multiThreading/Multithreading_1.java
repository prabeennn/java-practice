package multiThreading;

class T2 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("T2 ="+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
public class Multithreading_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T2 t=new T2();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main ="+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}

	}

}
