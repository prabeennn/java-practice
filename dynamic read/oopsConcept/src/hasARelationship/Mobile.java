package hasARelationship;

public class Mobile {
	
	
	SimCard s;
	String mobileName;
	String color;
	int ram;
	
	void insertSim(SimCard  s) {
		this.s=s;
	}

	public Mobile(String mobileName, String color, int ram) {
		//super();
		this.mobileName = mobileName;
		this.color = color;
		this.ram = ram;
	}
	public void call() {
		if(s!=null) {
			s.connect();
		}
		else {
			System.out.println("Insert Sim first");
		}
	}
//	public void mob() {
//		s.connect();
//		System.out.println(mobileName);
//		System.out.println(color);
//		System.out.println(ram);
//	}
	public static void main(String[] args) {
		Mobile m=new Mobile("nothing","black", 8);
		m.insertSim(new SimCard(797800056));
		m.call();
		//m.mob();
		
		
	}
	

}
