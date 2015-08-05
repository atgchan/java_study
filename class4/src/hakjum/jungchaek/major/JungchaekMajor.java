package hakjum.jungchaek.major;

import hakjum.jungchaek.IJungchaek;

public class JungchaekMajor implements IJungchaek{

	@Override
	public String getGrade(int score) {
		if(score > 100 || score < 0) {
			return "Invalid score";
		} else if(score >= 95) {
			return "S";
		} else if(score >= 90) {
			return "A";
		} else if(score >= 80) {
			return "B";
		} else if(score >= 70) {
			return "C";
		} else if(score >= 60) {
			return "D";
		} else {
			return "F";
		}
	}

}
