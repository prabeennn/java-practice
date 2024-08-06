package inderitance;
class Student{
	final int SID=101;
	String name;
	int age;
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(SID);
	}

//public class Final_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Prabeen",25);
		s1.display();
		Student s2=new Student("Prabeen N",25);
		s2.display();
	}

}
