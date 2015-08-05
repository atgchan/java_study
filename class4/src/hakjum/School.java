package hakjum;

import java.util.ArrayList;

public class School {
	private static School school = new School();
	private ArrayList<Student> studentList= new ArrayList<Student>();
	
	private School() {
		System.out.println("학교 생성!");
	}
	
	public static School getSchool() {
		if(school == null){
			school = new School();
		}
		return school;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
}
