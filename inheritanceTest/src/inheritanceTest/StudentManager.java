package inheritanceTest;

public class StudentManager {
	public void selectInstructor(Student student) {
		System.out.println(student.getName() + " Tarafından eğitmen seçildi");
	}
	public void removeInstructor(Student student2) {
		System.out.println(student2.getName() + " Tarafından eğitmen silindi");
	}

}
