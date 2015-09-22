package strategy;
import java.util.ArrayList;

import customer.customer;

public class strategyOptimize implements ICounterStrategy {

	@Override
	public customer getNextCustomer(ArrayList<customer> currentCustomer) {
		int index = 0;
		
		for(int i=1; i<currentCustomer.size(); i++){
			if(!currentCustomer.get(i).getHasTicket()){
				if(currentCustomer.get(i).getTimeTake() < currentCustomer.get(index).getTimeTake()){
					index = i;
				}
			}
		}
		if(currentCustomer.size()==0){
			return null;
		}
		return currentCustomer.remove(index);
	}

	@Override
	public String getName() {
		return "SJF";
	}

	@Override
	public int getNumber() {
		return 1;
	}

}
