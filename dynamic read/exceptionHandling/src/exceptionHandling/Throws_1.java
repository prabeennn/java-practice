package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		try {
			m1();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Main Ends");
	}
	public static void m1() throws Exception{
		m2();
	}
	public static void m2() throws FileNotFoundException{
		FileNotFoundException
		ClassNotFoundException;
		
		FileReader f=new FileReader("D:\\java practice\\A.java");
	}

}
