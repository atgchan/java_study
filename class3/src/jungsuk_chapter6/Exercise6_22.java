package jungsuk_chapter6;

public class Exercise6_22 {
	
	public static boolean isNumber(String s) {
		
		if(s.matches("^-?\\d+$")){
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "123o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));

	}

}
