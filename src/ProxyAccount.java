import java.util.Scanner;

public class ProxyAccount implements Account {
	private Account a;
	private String password;
	
	public ProxyAccount(String name, int accountID, double balance, String password) {
		this.a = new RealAccount(name, accountID, balance);
		this.password = password;
	}

	@Override
	public void setBalance(double newBalance) {
		if (checkPassword()) {
			a.setBalance(newBalance);
		}
	}

	@Override
	public double getBalance() {
		if (checkPassword()) {
			return a.getBalance();
		}
		return 0;
	}

	@Override
	public void setAccountID(int newAccountID) {
		a.setAccountID(newAccountID);
	}

	@Override
	public int getAccountID() {
		return a.getAccountID();
	}

	@Override
	public void setName(String name) {
		a.setName(name);
	}

	@Override
	public String getName() {
		return a.getName();
	}

	@Override
	public void printAccount() {
		if (checkPassword()) {
			a.printAccount();
		}
	}

	@Override
	public void addMoney(double money) {
		if (checkPassword()) {
			a.addMoney(money);
		}
	}

	@Override
	public void reduceMoney(double money) {
		if (checkPassword()) {
			a.reduceMoney(money);
		}
	}

	private boolean checkPassword() {
		boolean ok = false;
		System.out.print("Password: ");
		Scanner sc = new Scanner(System.in);
		String passwordInput = sc.next();
		if (this.password.equals(passwordInput)) {
			System.out.println("Access Granted");
			ok = true;
		}
		else {
			System.out.println("Access Denied");
		}
		return ok;
	}
}
