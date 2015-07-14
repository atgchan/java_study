package class1;

public class ManTest {

	public static void main(String[] args) {
		
		Man leeMan = new Man("이승기");
		leeMan.setHeight(123);
		//leeMan.setName("이승기");
		
		Man kimMan = new Man();
		kimMan.name = "김수현";
		
		System.out.println(leeMan.getName());
		System.out.println(kimMan.getName());
		
	}

}
