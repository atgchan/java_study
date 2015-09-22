package class6;

import junit.framework.TestCase;

public class StudentTest extends TestCase{

	public void testStudent() {
		
		String name = null;
		try {
			Student student = new Student(name);
			fail();
		} catch(StudentNameFormatException e) {
			assertEquals("name must not be null", e.getMessage());
		}
		
		try {
			Student student = new Student("Edward John Kim Test");
			fail();
		} catch(StudentNameFormatException e) {
			assertEquals("name is too long", e.getMessage());
		}
		
		Student student = new Student("James");
		assertEquals("James", student.getStudentName());
	}
}
