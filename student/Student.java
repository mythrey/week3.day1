package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Displaying student name under class Student");
	}

	public void studentDept() {
		System.out.println("Displaying student Dept under class Student");
	}

	public void studentId() {
		System.out.println("Displaying studentId under class Student");
	}

	public static void main(String[] args) {
		Student st = new Student();
		// inherited from own class
		st.studentDept();
		st.studentId();
		st.studentName();
		// Inherited from class department - single level
		st.deptName();
		// inherited from class college - multilevel
		st.collegeCode();
		st.collegeName();
		st.collegeRank();

	}
	 
}
