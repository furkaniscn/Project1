package inheritanceTest;

public class Instructor extends User {
	String instructorNumber;
	String instructorDetail;


	public Instructor(String instructorNumber, String instructorDetail) {
		this.instructorNumber = instructorNumber;
		this.instructorDetail = instructorDetail;
	}

	public Instructor() {

	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(String instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

}
