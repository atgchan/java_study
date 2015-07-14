package prac1;

public class Person {

	private String name;
	private float weight;
	private float height;
	
	public Person(String name) {
		//this라는 constructor 앞에는 다른것을 할 수 없다.
		//객체 생성이 끝나지 않았기 때문!
		this(name, 3.4f, 57.0f); //다른 constructor를 호출함!
	}
	
	public Person(String name, float weight, float height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	public Person getThis() {
		return this;
	}
}
