//                                          **COMPOSITION**
package hasARelationship;

public class Car {
	Engine e;
	String carName;
	String color;
	double price;
	public Car(Engine e, String carName, String color, double price) {
		//super();
		this.e = e;
		this.carName = carName;
		this.color = color;
		this.price = price;
	}
	
	public void cstart() {
		e.start();
		System.out.println(carName);
		System.out.println(color);
		System.out.println(price);
		System.out.println("Car started");
	}
	
	public static void main(String[] args) {
		Car c=new Car(new Engine(8000,"V12"),"Porse","Matt Black",20000000);
		c.cstart();
	}
	
	

}
