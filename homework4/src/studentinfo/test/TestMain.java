package studentinfo.test;

import studentinfo.CourseSession;
import studentinfo.School;
import studentinfo.Score;
import studentinfo.Student;
import studentinfo.report.GenerateGradeReport;
import studentinfo.utils.Define;

public class TestMain {

	School silverbellSchool = School.getInstance();
	CourseSession courseSessionMath;
	CourseSession courseSessionEng;
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		
		TestMain test = new TestMain();
		
		test.createCourseSession();
		test.createStudents();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
		
	}
	
	public void createCourseSession(){
		
		courseSessionMath = new CourseSession("����", Define.MATH);
		courseSessionEng = new CourseSession("����", Define.ENG);
		
		silverbellSchool.addCourseSession(courseSessionMath);
		silverbellSchool.addCourseSession(courseSessionEng);
		
	}
	
	public void createStudents(){
		
		Student student1 = new Student(141213, "�̽±�", courseSessionMath  );
		Student student2 = new Student(141518, "�����", courseSessionEng  );
		Student student3 = new Student(141230, "�� ��", courseSessionMath  );
		Student student4 = new Student(141255, "����", courseSessionMath  );
		Student student5 = new Student(141590, "�̹�ȣ", courseSessionEng  );
		
		silverbellSchool.addStudent(student1);
		silverbellSchool.addStudent(student2);
		silverbellSchool.addStudent(student3);
		silverbellSchool.addStudent(student4);
		silverbellSchool.addStudent(student5);

		courseSessionEng.enroll(student1);
		courseSessionEng.enroll(student2);
		courseSessionEng.enroll(student3);
		courseSessionEng.enroll(student4);
		courseSessionEng.enroll(student5);
		
		courseSessionMath.enroll(student1);
		courseSessionMath.enroll(student2);
		courseSessionMath.enroll(student3);
		courseSessionMath.enroll(student4);
		courseSessionMath.enroll(student5);
		
		addScoreForStudent(student1, 95, 20);
		addScoreForStudent(student2, 90, 100);
		addScoreForStudent(student3, 76, 60);
		addScoreForStudent(student4, 85, 89);
		addScoreForStudent(student5, 90, 95);
	}

	public void addScoreForStudent(Student student, int math, int eng){
		
		Score score1 = new Score(student.getStudentId(), courseSessionMath, math);
		Score score2 = new Score(student.getStudentId(), courseSessionEng, eng);
		
		student.addCourseScore(score1);
		student.addCourseScore(score2);
	}
}
