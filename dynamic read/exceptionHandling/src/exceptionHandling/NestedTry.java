package exceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts");
		try {
			String s="jspiders";
			char[]ch=s.toCharArray();
			//System.out.println(ch.length/0);
			try {
				System.out.println(s.length()/0);
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("AAAAA");
			}
			catch(ArithmeticException e) {   //If its in outer catch also no problem it will execute
				//always check for whats happening in try block
				System.out.println("Inner catch block");
			}
			catch(AgeIndexOutofBoundException e) {
				System.out.println("AGE");
			}
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Arithimatic Block");
		}
//		catch(ArithmeticException e) {
//			System.out.println("wewewewe");
//		}
		System.out.println("Main End");

	}

}
