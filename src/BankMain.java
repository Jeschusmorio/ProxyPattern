
public class BankMain {

	public static void main(String[] args) {
		Account a = new ProxyAccount("giro", 1000, 1000.00, "VerySecure");
		if (a.getAccountID() == 0) {		//wenn invalide AccountID
			a = null;						//Objekt löschen
		}
		try {
			a.printAccount();
			a.addMoney(-1000);
			a.addMoney(1000);
			System.out.println("Current Balance: "+a.getBalance());
			a.reduceMoney(1000);
			System.out.println("Current Balance: "+a.getBalance());
			a.setBalance(2000);
		}
		catch (NullPointerException e) {
			System.err.println("ERROR: Account doesn't exist");
		}
	}
	
}
