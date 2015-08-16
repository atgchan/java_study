package hashset;

public class AccountHashSetTest {

	public static void main(String[] args) {
		
		AccountManagerHashSet manager = new AccountManagerHashSet();
		
		manager.insertAccont("1231", "Tomas", 3000.0f);
		manager.insertAccont("1232", "Edward", 4000.0f);
		manager.insertAccont("1233", "James", 5000.0f);
		manager.insertAccont("1234", "Percy", 6000.0f);
		manager.insertAccont("1231", "Tomas2", 7000.0f);

		manager.setDeposite("1231", 500);
		manager.setDeposite("1232", 500);
		manager.setDeposite("1233", 500);
		manager.setDeposite("1234", 500);
		
		manager.displayAll();
	
	}

}
