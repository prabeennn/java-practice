package hasARelationship;

class Bike {

}

class Bajaj extends Bike {

}

class Rider {
	void ride(Bike b) {
		System.out.println("ride(Bike)");
	}

	void ride(Bajaj b) {
		System.out.println("ride(Bajaj)");
	}
}

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rider r = new Rider();
		Bike b = new Bajaj();
		// r.ride(null);
		r.ride(b);
		// Bajaj b2=new Bajaj();
		// Bike b1=new Bike();
		// r.ride(b1); // b1 is bike type so it will call bike
		/// r.ride(null);
		// r.ride(b2); // it will call bajaj and it depent on the reefrence type
	}

}
