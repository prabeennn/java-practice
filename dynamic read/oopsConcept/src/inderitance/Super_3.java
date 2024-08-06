package inderitance;
class G{
	G(){
		this(34,45);
	}
	G(int i){
		System.out.println("args cons of i "+i);
	}
	G(int i,int j){
		this(i);
		System.out.println("two cons of "+i+" "+j);
		
	}
}
class H extends G{
	H(){
		System.out.println("no args of H");
		//this(54,34);  //if we give here variable no need declare variable in main method
//	}	if we declare in main method and here also it will use the main method variable
	}
	H(int i){
		
		System.out.println("one args cons of H "+i);
	}
	H(int i, int j){
		this(i);
		System.out.println("tho args cons of H "+i+" "+j);
	
	}
}
public class Super_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H h=new H(56,87);
		//G g=new G(39,31);

	}

}
