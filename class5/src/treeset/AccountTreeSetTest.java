package treeset;

public class AccountTreeSetTest {

	public static void main(String[] args) {
		
		AccountManagerTreeSet manager = new AccountManagerTreeSet();
		
		manager.insertAccont("1231", "Tomas", 3000.0f);
		manager.insertAccont("1232", "Edward", 4000.0f);
		manager.insertAccont("1233", "James", 5000.0f);
		manager.insertAccont("1234", "Percy", 6000.0f);
		manager.insertAccont("1235", "Elizabeth", 7000.0f);

		manager.setDeposite("1231", 500);
		manager.setDeposite("1232", 500);
		manager.setDeposite("1233", 500);
		manager.setDeposite("1234", 500);
		manager.setDeposite("1235", 500);
		
		manager.displayAll();
	}

}
