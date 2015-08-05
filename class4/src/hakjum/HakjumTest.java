package hakjum;

import hakjum.jungchaek.IJungchaek;
import hakjum.jungchaek.major.JungchaekMajor;
import hakjum.jungchaek.nonmajor.JungchaekNonMajor;

public class HakjumTest {

	public static void main(String[] args) {
		School school = School.getSchool();
		school.addStudent(new Student("이승기", 141213, "수학", 95, 20));
		school.addStudent(new Student("김수현", 141518, "영어", 90, 100));
		school.addStudent(new Student("주원", 141230, "수학", 76, 60));
		school.addStudent(new Student("김우빈", 141255, "수학", 85, 89));
		school.addStudent(new Student("이민호", 141590, "영어", 90, 95));
		
		IJungchaek jungchaek = null;
		JungchaekMajor jungchaekMajor = new JungchaekMajor();
		JungchaekNonMajor jungchaekNonMajor = new JungchaekNonMajor();
		
		for(int i=0; i<school.getStudentList().size(); i++) {
			Student student = school.getStudentList().get(i);
			System.out.println("-----------------------------------");
			System.out.println(student.getName());
			System.out.printf("전공: %s\n", student.getMajor());
			if(student.getMajor().equals("수학")) {
				System.out.printf("수학: %d ", student.getMath());
				jungchaek = jungchaekMajor;
				System.out.println(jungchaek.getGrade(student.getMath()));
				System.out.printf("영어: %d ", student.getEnglish());
				jungchaek = jungchaekNonMajor;
				System.out.println(jungchaek.getGrade(student.getEnglish()));
			} else if(student.getMajor().equals("영어")) {
				System.out.printf("수학: %d ", student.getMath());
				jungchaek = jungchaekNonMajor;
				System.out.println(jungchaek.getGrade(student.getMath()));
				System.out.printf("영어: %d ", student.getEnglish());
				jungchaek = jungchaekMajor;
				System.out.println(jungchaek.getGrade(student.getEnglish()));
			}
		}
	}

}
