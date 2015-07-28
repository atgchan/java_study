package jungsuk_chapter6;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.printf("펴윤: %.2f \n", s.getAverage());
	}
}

class Student {
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	Student(){}
	
	//학생이름
	String name;
	//번
	int ban;
	//번호
	int no;
	//국어점수
	int kor;
	//영어점수
	int eng;
	//수학점수
	int math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return (float)(kor + eng + math)/3;
	}
	
	public String info() {
		String s = "";
		s += name+", ";
		s += ban+", ";
		s += no+", ";
		s += kor+", ";
		s += eng+", ";
		s += math+", ";
		s += getTotal()+", ";
		s += String.format("%.1f", getAverage());
		
		return s;
	}
}

