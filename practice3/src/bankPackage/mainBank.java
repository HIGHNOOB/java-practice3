package bankPackage;

public class mainBank {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("123-456789", "ȫ�浿", 10000);

		ba.printStatus();
		ba.deposit(20000);
		ba.withDraw(45000);
		ba.withDraw(15000);

	}

}
