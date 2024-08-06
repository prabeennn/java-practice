package hasARelationship;

public class Student {
	private int studentId;
	private String studentName;
	private College c;     //Has a relation happens // here it refers to college class variables
	public Student(int studentId, String studentName, College college) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.c = college;
	}
	
	public void showStudentData() {
		System.out.println("-----------Student details------------");
		System.out.println("Student id is :"+studentId);
		System.out.println("Student Name is: "+studentName);
		System.out.println("College Name: "+c.collegeName);
		System.out.println("College Location: "+c.collegeLocation);
	}

}
