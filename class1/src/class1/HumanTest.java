package class1;

public class HumanTest {

	public static void main(String[] args) {
		Human man = new Human(45, "아무개", "no", 3);
		
		System.out.print("Age : ");
		System.out.println(man.getAge());
		System.out.print("Name : ");
		System.out.println(man.getName());
		System.out.print("Marriage : ");
		System.out.println(man.getMarriage());
		System.out.print("Number of child : ");
		System.out.println(man.getNumOfChild());
	}

}
