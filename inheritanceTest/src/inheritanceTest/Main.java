package inheritanceTest;

public class Main {
	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setName("Furkan");
		student.setLastName("İşcan");
		student.setIdentityNumber("12345678911");
		student.setEmail("furkan.furkan@outlook.com");
		student.setStudentNumber("12345451");
		student.setSchoolName("Fırat Üniversitesi");

		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Esra");
		instructor.setLastName("Sancak");
		instructor.setIdentityNumber("12345678912");
		instructor.setEmail("esra.esra@outlook.com");
		instructor.setInstructorNumber("12345678");
		instructor.setInstructorDetail("Java,Python,C#,Swift ve daha birçok dilde uzman");
		
		User[] users = {student, instructor};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addStudent(instructor);
		instructorManager.removeStudent(instructor);
		instructorManager.updatedStudent(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.selectInstructor(student);
		studentManager.removeInstructor(student);

	}

}
