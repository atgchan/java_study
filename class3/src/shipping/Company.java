package shipping;

import java.util.ArrayList;

public class Company {
	
	private Company() {};
	private static ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
	
	static Company instance = new Company();
	
	public static Company getCompany() {
		return instance;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vList.add(vehicle);
	}
	
	public ArrayList<Vehicle> getList() {
		return vList;
	}
	
}
