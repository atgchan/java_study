package ArrayList;

public class Employee {
	
	public String name;
	protected double salary;
	private int idNum;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalaray(double salary) {
		this.salary = salary;
	}
	
	public String showInfo() {
		return name + ", " + idNum; 
	}
}
