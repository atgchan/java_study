package hyundai;

public abstract class Hyundai {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	
	public final void carRun() {
		start();
		drive();
		stop();
	}
	
	public void wash(){
		
	}

}
