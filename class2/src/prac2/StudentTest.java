package prac2;

public class StudentTest {

	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Student("김구라", "컴공", "우리집");
		Student c = new Student("아무개", "디자인", "옆");
		
		a.printStudent();
		b.printStudent();
		c.printStudent();

	}

}
