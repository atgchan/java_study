package prac3;

public class SingleTone {
	
	private static SingleTone instance = new SingleTone();
	
	private SingleTone() {}
	
	//convention하게 singletone 구현하는 방법
	public static SingleTone getInstance() {
		
		if(instance == null)
			instance = new SingleTone();
		
		return instance;
	}
}
