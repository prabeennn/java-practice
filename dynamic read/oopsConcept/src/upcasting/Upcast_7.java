package upcasting;
class Car_1{
	void start() {}
	void accelerate() {}
	void stop() {}
}
class Audi_1 extends Car_1{
	void start() {
		System.out.println("Audi starts");
	}
	void accelerate() {
		System.out.println("Audi accelerated");
	}
	void stop() {
		System.out.println("Audi stops");
	}
}
class BMW_1 extends Car_1{
	void start() {
		System.out.println("BMW starts");
	}
	void accelerate() {
		System.out.println("BMW accelerate");
	}
	void stop() {
		System.out.println("BMW stops");
	}
}
class Drive{
	void drive(Car_1 c) {
		c.start();
		c.accelerate();
		c.stop();
	}
}
public class Upcast_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drive d=new Drive();
		d.drive(new Audi_1());
		d.drive(new BMW_1());

	}

}
