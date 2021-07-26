package overloading;

public class Students {

	public void getStudentInfo(int id) {

		System.out.println("Getting student id info: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Getting student id: " + id + " and " + " name info " + name);
	}

	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("Getting student email " + email + " and " + " phone number " + phonenumber);
	}

	public static void main(String[] args) {

		// Overloading concept
		Students st = new Students();
		st.getStudentInfo(10, "Rajalakshmi");
		st.getStudentInfo(10);
		st.getStudentInfo("rajirox89@gmail.com", "(425)615-0009");
	}
}
