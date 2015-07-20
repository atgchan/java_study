package shipping;

public class Truck extends Vehicle{
	
	private double tripDistance;
	private double tripEfficiency;
	
	public Truck(double distance, double efficiency) {
		this.tripDistance = distance;
		this.tripEfficiency = efficiency;
	}

	@Override
	public double calcTripDistance() {
		return tripDistance;
	}

	@Override
	public double calcFuelEfficiency() {
		return tripEfficiency;
	}

}
