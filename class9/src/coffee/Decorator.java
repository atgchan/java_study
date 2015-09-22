package coffee;

public class Decorator extends Coffee{
	
	Coffee coffee;
	
	//이럴 경우에는 Default Constructor를 제공해주면 안됨! 케바케.
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	
	@Override
	public void brewing() {
		coffee.brewing();
	}

}
