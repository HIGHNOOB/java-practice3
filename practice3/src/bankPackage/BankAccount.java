package bankPackage;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
	private String strAccountNumber;
	private String strAccountHolder;
	private int iAmount;
	
	public BankAccount() {
		this.strAccountNumber = "None";
		this.strAccountHolder = "None";
		this.iAmount = 0;		
	}
	
	public BankAccount(String accountNumber, String accountHolder, int amount) {
		this.strAccountNumber = accountNumber;
		this.strAccountHolder = accountHolder;
		this.iAmount = amount;		
	}
	
	public boolean withDraw(int amount) {
		if(!canWithdraw(amount)) {
			String strFormat = "error[%s]: 계좌 잔액 부족\n";
			System.out.printf(strFormat, this.strAccountHolder);
			return false;
		}
		this.iAmount -= amount;
		printBalance();
		
		return true;
	}
	
	public boolean deposit(int amount) {
		if(!canDeposit(amount)) {
			String strFormat = "error: 입금액이 0이거나 음수입니다.\n";
			System.out.printf(strFormat);
			return false;
		}
		this.iAmount += amount;
		printBalance();
		
		return true;
	}
	
	public boolean canWithdraw(int amount) {
		if(this.iAmount>=amount) return true;
		return false;
	}
	
	public boolean canDeposit(int deopsitMoney) {
		if(deopsitMoney>0) return true;
		return false;
	}
	
	public void printBalance() {
		String strFormat = "잔액: %s 원\n";
		System.out.printf(strFormat, convertToDecimalFormat(this.iAmount));
	}
	
	public void printStatus() {
		String strFormat = "계좌 %s (예금주:%s)%n잔액: %s 원\n";
		System.out.printf(strFormat, this.strAccountNumber, this.strAccountHolder,
						convertToDecimalFormat(this.iAmount));
	}
	
	protected int getBalance() {
		return this.iAmount;
	}
	
	protected String getAccountHolder() {
		return this.strAccountHolder;
	}
	
	protected String getAccountNumber() {
		return this.strAccountNumber;
	}
	
	private String convertToDecimalFormat(int amount) {
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA);
		nf.setMaximumFractionDigits(3);
		return nf.format(amount);
	}	

}
