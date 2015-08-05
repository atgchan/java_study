package hakjum.jungchaek.nonmajor;

import hakjum.jungchaek.IJungchaek;

public class JungchaekNonMajor implements IJungchaek{

	@Override
	public String getGrade(int score) {
		if(score > 100 || score < 0) {
			return "Invalid score";
		} else if(score >= 90) {
			return "A";
		} else if(score >= 80) {
			return "B";
		} else if(score >= 70) {
			return "C";
		} else if(score >= 55) {
			return "D";
		} else {
			return "F";
		}
	}

}
