package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new Americano(); // Americano Coffee
		americano.brewing();
		
		System.out.println();
		
		Coffee latte = new LatteCoffee(new Americano()); // Americano Coffee Adding Milk
		latte.brewing();
		
		System.out.println();
		
		Coffee mocha = new MochaCoffee(new LatteCoffee(new Americano()));
			// Americano Coffee Adding Milk Adding Mocha Syrup
		mocha.brewing();
	}

}
