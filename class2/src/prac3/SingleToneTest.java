package prac3;

import java.util.Calendar;

public class SingleToneTest {

	public static void main(String[] args) {
		
		//날짜는 어디서 불러도 같은 날짜가 유지되야 함
		//그래서 singletone으로 만들었
		Calendar cal = Calendar.getInstance();
		
		SingleTone s1 = SingleTone.getInstance();

	}

}
