package practiseByMKT;
/*
class User {
	void login() {
		System.out.println("User login");
	}
}

class Admin extends User {
	void login() {
		System.out.println("Admin login");
	}
}

class Teacher extends User {
	void login() {
		System.out.println("Teacher login");
		super.login();
	}
}
*/
class Student //extends User
{
	void login() {
		System.out.println("Student login");
	}
}

public class MethodOverriding extends Student
{
	void login() {
		System.out.println("Teacher login");
	}
	public static void main(String[] args) {
	
	/*	MethodOverriding m1=new MethodOverriding();
		m1.login();
		*/
		Student s1=new Student();
		s1.login();
		
		
		/*	User u = new User();
		u.login();

		Admin a = new Admin();
		a.login();

		Teacher t = new Teacher();
		t.login();

		Student s = new Student();
		s.login();
		*/
	}
}
