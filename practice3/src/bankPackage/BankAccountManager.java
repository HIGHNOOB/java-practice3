package bankPackage;

import java.util.ArrayList;

public class BankAccountManager {	
	private ArrayList<BankAccount> alBankAccounts;
	
	//TODO ������
	public BankAccountManager() {
		alBankAccounts = new ArrayList<BankAccount>();
	}
	
	//TODO ����߰�
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
	
	//TODO ���°� �ŷ�����
	
	//TODO ���°�ü��ȯ
	public BankAccount getAccount(String account) {
		return null;
	}

	

	

	

}
