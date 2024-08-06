package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;

public class Throw_ {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		m1();

	}
	public static void m1()throws FileNotFoundException {
		m2();
	}
	public static void m2()throws FileNotFoundException {
		FileReader f=new FileReader("D:\\java practice\\A.java");
		//System.out.println("handledd");
	}

}
