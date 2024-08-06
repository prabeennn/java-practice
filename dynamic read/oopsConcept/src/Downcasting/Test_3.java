package Downcasting;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VegShop shop =new VegShop();
		Vegetable v=shop.sell();
		
		if(v instanceof Carrot) {
			((Carrot)v).prepareHalwa();
		}
		if(v instanceof Potato) {
			((Potato)v).prepareFries();
		}
	}

}
