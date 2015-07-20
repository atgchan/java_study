package shipping;

import java.util.ArrayList;

public class GenerateReport {

	public double generateGuelNeeds() {
		Company company = Company.getCompany();
		ArrayList<Vehicle> vList = company.getList();
		double sum = 0.0;
		for(int i=0; i<vList.size(); i++) {
			sum += vList.get(i).calcFuelNeeds();
		}
		return sum;
	}

}
