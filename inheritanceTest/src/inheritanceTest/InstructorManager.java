package inheritanceTest;

public class InstructorManager {
	public void addStudent(Instructor instructor) {
		System.out.println(instructor.getName() + instructor.getLastName() + " Taraf�ndan ��renci eklendi");
	}
	public void removeStudent(Instructor instructor2) {
		System.out.println(instructor2.getName() + instructor2.getLastName() + " Taraf�ndan ��renci kald�r�ld�");
	}
	public void updatedStudent(Instructor instructor3) {
		System.out.println(instructor3.getName() + instructor3.getLastName()  + " Taraf�ndan ��renci g�ncellendi");
	}

}
