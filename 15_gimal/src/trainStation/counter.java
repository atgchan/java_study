package trainStation;
import java.util.ArrayList;

import customer.customer;
import strategy.ICounterStrategy;
import strategy.strategyBasic;
import strategy.strategyOptimize;

public class counter {

	private ArrayList<clerk> clerkList = new ArrayList<clerk>();
	private ICounterStrategy strategy;
	
	public counter(String strategy){
		if(strategy.equals("basic")){
			this.strategy = new strategyBasic();
		}
		else if(strategy.equals("optimize")){
			this.strategy = new strategyOptimize();
		}
		else {
			System.out.println("invalid strategy name");
			System.exit(0);
		}
		
		//직원 3명 카운터에 집어넣음
		clerkList.add(new clerk());
		clerkList.add(new clerk());
		clerkList.add(new clerk());
	}
	
	public clerk getAvailableClerk(){
		for(int i=0; i<clerkList.size(); i++){
			if(clerkList.get(i).getAvailibility()){
				return clerkList.get(i);
			}
		}
		return null;
	}

	public void recieveCustomer(ArrayList<customer> currentCustomer, ArrayList<customer> trainLine, int currentTime) {
		customer customer;
		clerk clerk;
		
		while((clerk = getAvailableClerk()) != null){
			customer = strategy.getNextCustomer(currentCustomer);
			if(customer != null){
				clerk.acceptCustomer(customer, currentTime);
			}
			else{
				return;
			}
		}

	}

	public void updateClerkStatus(int currentTime, ArrayList<customer> trainLine) {
		for(int i=0; i<clerkList.size(); i++){
			clerkList.get(i).updateStatus(currentTime, trainLine);
		}
	}

	public String getStrategyName() {
		return strategy.getName();
	}

	public int getStrategyNumber() {
		return strategy.getNumber();
	}
	
	
}
