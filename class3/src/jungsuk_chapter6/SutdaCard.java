package jungsuk_chapter6;

public class SutdaCard {
	//카드의 숫자 (1~10 사이의 정수)
	int num;
	//광이면 true 아니면 false
	boolean isKwang;
	
	public SutdaCard() {
		num = 1;
		isKwang = true;
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info() {
		String tmp = (isKwang)?"K":"";
		return String.valueOf(num) + tmp; 
	}
}
