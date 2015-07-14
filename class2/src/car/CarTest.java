package car;

public class CarTest {
	
	public static void main(String[] args) {

		CarCompany company = CarCompany.getInstance();
		company.addCar(new Sonata());
		company.addCar(new Sonata());
		company.addCar(new Sonata());
		company.addCar(new Grandure());
		company.addCar(new Grandure());
		company.addCar(new Genesis());
		
		Calculator calc = new Calculator();
		System.out.println(calc.getPriceSum());
	}
}
