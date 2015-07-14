package subclassing;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		String s = new String("춘향이");
		list.add(s);
		
		String str = list.get(0);
		System.out.println(str);

	}

}
