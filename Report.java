package week1.day1;

class Student {

	String studentName="Swetha";
	int rollNo=51;
	String collegeName="MCW";
	int markScored=75;
	float cgpa=72.3f;	
}


public class Report {
	public static void main(String[] args) {
		Student student_obj = new Student();
		System.out.println(student_obj.studentName);
		System.out.println(student_obj.rollNo);
		System.out.println(student_obj.collegeName);
		System.out.println(student_obj.markScored);
		System.out.println(student_obj.cgpa);
	}
}
