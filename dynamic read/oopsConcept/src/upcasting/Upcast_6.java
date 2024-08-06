package upcasting;
class K{
	void run() {
		System.out.println("K is running");
	}
}
class L extends K{
	void run() {
		System.out.println("L is running");
	}
}
class M extends K{
	void run() {
		System.out.println("M is running");
	}
}
public class Upcast_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K k=new K();
		k.run();
		
		k=new L();
		k.run();
		
		k=new M();
		k.run();
		
	}

}
