package multiThreading;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("child"+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
	}
}

public class Daemon_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m=new MyThread();
		m.setDaemon(true);
		m.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main"+i);
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				
			}
		}
		

	}

}
