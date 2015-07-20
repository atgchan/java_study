package ArrayList;

public class Secretary extends Employee{
	
	public String bossName;
	
	public Secretary(String name, String bossName) {
		super(name);
		this.bossName = bossName;
	}
	
	public String showInfo() {
		return super.showInfo() + ", " + bossName;
	}
}
