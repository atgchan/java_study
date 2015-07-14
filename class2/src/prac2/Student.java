package prac2;

public class Student {
	
	//java에서 상수를 선언할 때 다음과 같이 사용함
	public static final int MAX_LEN = 100;
	
	private static int staticNumber = 1000;
	private int number;
	private String name;
	private String major;
	private String addr;
	
	public Student() {
		this.number = ++staticNumber;
		this.name = "이름없음";
		this.major = "학과없음";
		this.addr = "주소없음";
	}
	
	public Student(String name, String major, String addr) {
		this.number = ++staticNumber;
		this.name = name;
		this.major = major;
		this.addr = addr;
	}
	
	public void printStudent() {
		System.out.println(this.number);
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.addr);
	}
	
}
