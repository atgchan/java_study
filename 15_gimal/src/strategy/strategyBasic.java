package strategy;
import java.util.ArrayList;

import customer.customer;

public class strategyBasic implements ICounterStrategy {

	@Override
	public customer getNextCustomer(ArrayList<customer> currentCustomer) {
		for(int i=0; i<currentCustomer.size(); i++){
			if(!currentCustomer.get(i).getHasTicket()){
				return currentCustomer.remove(i);
			}
		}
		return null;
	}

	@Override
	public String getName() {
		return "FIFO";
	}

	@Override
	public int getNumber() {
		return 0;
	}

}
