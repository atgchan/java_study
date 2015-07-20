package Test;

import junit.framework.TestCase;

public class StudentTest extends TestCase{

	public void testStudent() {
		
		Student student = new Student("James");
		assertEquals("James", student.getName());
	}
}
