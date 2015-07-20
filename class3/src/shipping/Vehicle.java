package shipping;

public abstract class Vehicle {
	
	protected double tripDistance;
	protected double tripEfficiency;
	
	public abstract double calcTripDistance();
	public abstract double calcFuelEfficiency();
	
	public final double calcFuelNeeds() {
		return calcTripDistance() / calcFuelEfficiency();
	}
}
