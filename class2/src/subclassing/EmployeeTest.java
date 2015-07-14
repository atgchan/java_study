package subclassing;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("김일꾼");
		e.salary = 100000.0;
		System.out.println(e.getDetail());
		
		Manager m = new Manager("아무개");
		m.department = "Personal";
		System.out.println(m.getDetail());
		
		Employee em = new Manager("이씨");
		System.out.println(em.getDetail());

	}

}
