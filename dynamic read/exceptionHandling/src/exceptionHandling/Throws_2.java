package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
	void readFile() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException{
		String text="this is demo";
		FileOutputStream fos=new FileOutputStream("d:/abc.txt");
	}
}
public class Throws_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadAndWrite r=new ReadAndWrite();
		try {
		r.readFile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
 		try {
		r.saveFile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		//System.out.println("hello");
		

	}

}
