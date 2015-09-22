package trainStation;
import java.util.ArrayList;

import customer.customer;

public class clerk {

	private boolean availability = true;
	private int acceptCustomerTime = 0;
	private customer currentCustomer = null;

	
	public boolean getAvailibility(){
		return availability;
	}

	public void acceptCustomer(customer customer, int currentTime) {
		currentCustomer = customer;
		acceptCustomerTime = currentTime;
		availability = false;
	}

	public void updateStatus(int currentTime, ArrayList<customer> trainLine) {
		if(currentCustomer == null){
			return;
		}
		if(currentTime >= (acceptCustomerTime + currentCustomer.getTimeTake())){
			currentCustomer.setCheckInTime(currentTime);
			trainLine.add(currentCustomer);
			currentCustomer = null;
			availability = true;
		}
		
	}
}
