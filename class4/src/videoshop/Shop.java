package videoshop;

import java.util.ArrayList;
import java.util.List;

public class Shop{
	
	protected List<String> shelf = new ArrayList<String>();
	
	public int getCount(){
		return shelf.size();
	}
}
