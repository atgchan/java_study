package subclassing;

public class Manager extends Employee {
	//상속은 general에서 specific한 구조로 갈 때 사용한다
	public String department;
	
	public Manager(String name){
		//super(); //모든 constructor는 object라는 클래스를 상속한다
		super(name); 
	}
	
	public String getDetail() {
		return super.getDetail() + ", " + department;
	}
}
