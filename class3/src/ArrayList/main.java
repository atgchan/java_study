package ArrayList;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Company c = Company.getCompany();
		c.addEmployee(new Manager("Janems", "Personal"));
		c.addEmployee(new Manager("Thomas", "Finance"));
		c.addEmployee(new Secretary("Lee", "James"));
		
		ArrayList<Employee> eList = c.getList();
		
		for(int i=0; i<eList.size(); i++) {
			System.out.println(eList.get(i).showInfo());
		}

	}

}
