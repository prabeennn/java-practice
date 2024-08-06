package hasARelationship;

public class SimCard {
		long simNum;

		public SimCard(long simNum) {
			//super();
			this.simNum = simNum;
		}
		public void connect() {
			System.out.println(simNum);
			System.out.println("call is connnected");
		}
		
		
}

