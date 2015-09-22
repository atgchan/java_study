package hashmap;

public class AccountHashMapTest {

	public static void main(String[] args) {
		
		AccountManagerArrayList manager = new AccountManagerArrayList();
		
		manager.insertAccont("1231", "Tomas", 3000.0f);
		manager.insertAccont("1232", "Edward", 4000.0f);
		manager.insertAccont("1233", "James", 5000.0f);

		manager.setDeposite("1231", 500);
		manager.setDeposite("1232", 500);
		manager.setDeposite("1233", 500);
		
		manager.displayAll();
	}

}
