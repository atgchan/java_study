package strategy;
import java.util.ArrayList;

import customer.customer;

public interface ICounterStrategy {

	public customer getNextCustomer(ArrayList<customer> currentCustomer);

	public String getName();
	public int getNumber();

}
