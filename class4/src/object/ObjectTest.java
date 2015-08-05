package object;

class Dog{
	String name;
	String type;
	
	public Dog(String name, String type){
		this.name = name;
		this.type = type;
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("징구", "혼혈");
		System.out.println(myDog);
		
		String str = new String("aaa");
		System.out.println(str);
		
		String str1 = new String("abc");
		String str2 = new String("ccc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	
	}

}
