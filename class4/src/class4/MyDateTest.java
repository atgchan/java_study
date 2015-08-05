package class4;

class MyDate {
	
	int year;
	int month;
	int day;
	
	MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object obj){
		MyDate m = (MyDate) obj;
		return ((this.year==m.year)&&(this.month==m.month)&&(this.day==m.day));
	}
	
	public int hashCode(){
		return day^month^year;
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate m1 = new MyDate(31, 7, 2015);
		MyDate m2 = new MyDate(31, 7, 2015);
	
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}

}
