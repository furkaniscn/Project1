package inheritanceTest;

public class Student extends User {
	private String studentNumber;
	private String schoolName;

	public Student(String studentNumber, String schoolName) {
		this.studentNumber = studentNumber;
		this.schoolName = schoolName;
	}

	public Student() {

	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
