package inheritanceTest;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " id'li ��renci Kaydedildi");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
			
		}
	}

}
