package ArrayList;
import java.util.ArrayList;

public class Company {
	
	ArrayList<Employee> eList = new ArrayList<Employee>();
	
	private static Company instance = new Company();
	
	static { //스태틱 블럭
		//프로그램이 프로세스로 메모리에 로딩될 때 한 번만 불려짐
		//ex) Connection Factory
		int MAX = 100;
		ArrayList aList = new ArrayList();
	}
	
	private Company() {
		
	}
	
	public static Company getCompany() {
		return instance;
	}
	
	public void addEmployee(Employee e) {
		eList.add(e);
	}
	
	public ArrayList<Employee> getList() {
		return eList;
	}
}
