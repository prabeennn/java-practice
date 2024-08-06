//                                          **COMPOSITION**
package hasARelationship;

public class Engine {
	int cc;
	String eName;
	public Engine(int cc, String eName) {
		//super();
		this.cc = cc;
		this.eName = eName;
	}
	public void start() {
		System.out.println(cc);
		System.out.println(eName);
		System.out.println("Engine Started");
	}
	
	

}
