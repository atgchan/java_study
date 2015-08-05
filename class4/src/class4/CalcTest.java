package class4;

public class CalcTest {

	public static void main(String[] args) {
		
		iCalc calc = new Calculator();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.sub(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
	}

}
