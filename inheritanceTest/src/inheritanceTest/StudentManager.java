package inheritanceTest;

public class StudentManager {
	public void selectInstructor(Student student) {
		System.out.println(student.getName() + " Taraf�ndan e�itmen se�ildi");
	}
	public void removeInstructor(Student student2) {
		System.out.println(student2.getName() + " Taraf�ndan e�itmen silindi");
	}

}
