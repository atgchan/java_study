package prac1;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("곱슬머리", 182.0f, 55.0f);
		
		p.printThis();
		System.out.println(p);
		
		System.out.println(p.getThis());
	}

}
