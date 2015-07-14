package subclassing;

public class Employee {
	
	public String name;
	public int sabun;
	protected double salary;
	
	public Employee(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDetail() {
		return name + ", " + salary + ", " + sabun;
	}
	
}
