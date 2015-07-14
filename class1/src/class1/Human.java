package class1;

public class Human {
	private int age;
	private String name;
	private String marriage;
	private int numOfChild;
	
	public Human(int age, String name, String marriage, int numOfChild){
		this.age = age;
		this.name = name;
		this.marriage = marriage;
		this.numOfChild = numOfChild;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public int getNumOfChild() {
		return numOfChild;
	}

	public void setNumOfChild(int numOfChild) {
		this.numOfChild = numOfChild;
	}
}
