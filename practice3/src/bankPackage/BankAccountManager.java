package bankPackage;

import java.util.ArrayList;

public class BankAccountManager {	
	private ArrayList<BankAccount> alBankAccounts;
	
	//TODO 생성자
	public BankAccountManager() {
		alBankAccounts = new ArrayList<BankAccount>();
	}
	
	//TODO 계좢추가
	public boolean addAccount(String account, String holder, int amount) {
		for (BankAccount ba : alBankAccounts) {
			if (ba.getAccountHolder() == account)
				System.out.println("error msg");
			return false;
		}

		BankAccount ba = new BankAccount(account, holder, amount);
		alBankAccounts.add(ba);
		return true;
	}

	public void removeAccount(String account) {

	}
	
	//TODO 계좌간 거래구현
	
	//TODO 계좌객체반환
	public BankAccount getAccount(String account) {
		return null;
	}

	

	

	

}
