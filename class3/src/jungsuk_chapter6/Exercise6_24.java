package jungsuk_chapter6;

public class Exercise6_24 {

	public static int abs(int i){
		if(i < 0)
			return i * -1;
		else
			return i;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value)); 
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}

}
