package jdbcdemo;

public class LoadAndRegisterDriver {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver registered successfully");

	}

}
