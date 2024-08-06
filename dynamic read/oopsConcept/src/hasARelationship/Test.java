package hasARelationship;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c1=new College("Jspiders","Benglore");
		College c2=new College("jsp", "beng");
		
		Student s1=new Student(1,"Prabeen", c1);
		s1.showStudentData();
		
		Student s2=new Student(2,"Swaraj", c1);
		s2.showStudentData();
		
		Student s3=new Student(23, "Swastik", c1);
		s3.showStudentData();
		
		Student s4=new Student(1, "Prabeen", c2);
		s4.showStudentData();
		

	}

}
