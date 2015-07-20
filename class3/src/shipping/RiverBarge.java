package shipping;

public class RiverBarge extends Vehicle {

	private double tripDistance;
	private double tripEfficiency;
	
	public RiverBarge(double distance, double efficiency) {
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
