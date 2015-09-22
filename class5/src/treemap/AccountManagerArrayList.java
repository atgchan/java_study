package treemap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class AccountManagerArrayList {
	
	public TreeMap<String, Account> accounts;
	
	public AccountManagerArrayList(){
		this(10);
	}
	public AccountManagerArrayList(int size){
		accounts = new TreeMap<String, Account>();
	}
	
	public void insertAccont(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.put(accountNumber, account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		if(accounts.containsKey(accountNumber)) {
			Account account = accounts.get(accountNumber);
			account.deposite(money);
			return;
		}
		
		/*Iterator<Account> ir = accounts.iterator();
		
		while(ir.hasNext()){
			Account a = ir.next();
			String tmpNumber = a.getAccountNumber();
			if(tmpNumber.equals(accountNumber)){
				a.deposite(money);
				return;
			}
		}*/
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
		
		Iterator<String> ir = accounts.keySet().iterator();
		
		//Iterator<Account> ir = accounts.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		System.out.println(accounts);
		
//		for(int i=0; i<accounts.size(); i++){
//			System.out.println(accounts.get(i));
//		}
	}
}
