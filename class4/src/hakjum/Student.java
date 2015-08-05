package hakjum;

public class Student {
	private String name;
	private int hakbun;
	private String major;
	private int math;
	private int english;
	
	public Student(String name, int hakbun, String major, int math, int english) {
		this.name = name;
		this.hakbun = hakbun;
		this.major = major;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public int getHakbun() {
		return hakbun;
	}

	public String getMajor() {
		return major;
	}

	public int getMath() {
		return math;
	}

	public int getEnglish() {
		return english;
	}
	
}
