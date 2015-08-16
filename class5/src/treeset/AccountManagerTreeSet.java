package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class AccountManagerTreeSet {
	
	public TreeSet<Account> accounts;
	
	public AccountManagerTreeSet(){
		this(10);
	}
	public AccountManagerTreeSet(int size){
		accounts = new TreeSet<Account>();
	}
	
	public void insertAccont(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.add(account);
	}
	
	public void setDeposite(String accountNumber, float money){
		Iterator<Account> ir = accounts.iterator();
		
		while(ir.hasNext()){
			Account a = ir.next();
			String tmpNumber = a.getAccountNumber();
			if(tmpNumber.equals(accountNumber)){
				a.deposite(money);
				return;
			}
		}
		System.out.println("There is no account");
	}
		
//		for(int i=0; i<accounts.size(); i++){
//			Account account = (Account)accounts.get(i);
//			String tmpNumber = account.getAccountNumber();
//			if(tmpNumber.equals(accountNumber)){
//				account.deposite(money);
//				return;
//			}
//		}
//		System.out.println("There is no account");
//	}
	
	public void displayAll(){
		Iterator<Account> ir = accounts.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		System.out.println(accounts);
		
//		for(int i=0; i<accounts.size(); i++){
//			System.out.println(accounts.get(i));
//		}
	}
}
