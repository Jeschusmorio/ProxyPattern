
public class RealAccount implements Account {
	public String name;
	public int accountID;
	private double balance;
	
	public RealAccount(String name, int accountID, double balance) {
		setAccountID(accountID);
		setName(name);
		setBalance(balance);
	}
	@Override
	public void setBalance(double newBalance) {
		System.out.println("New Balance: "+newBalance);
		this.balance = newBalance;
	}
	@Override
	public double getBalance() {
		return this.balance;
	}
	@Override
	public void setAccountID(int newAccountID) {
		if (newAccountID > 0) {
			this.accountID = newAccountID;
		}
		else {
			System.out.println("Invalid Account ID");
			return;
		}
	}
	@Override
	public int getAccountID() {
		return this.accountID;
	}
	@Override
	public void setName(String newName) {
		this.name = newName;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void printAccount() {
		System.out.println("ID:\t\t"+this.getAccountID());
		System.out.println("Name:\t\t"+this.getName());
		System.out.println("Balance:\t"+this.getBalance());
	}
	private void changeBalance(double money) {
		this.balance = this.balance + money;
	}
	public void addMoney(double money) {
		if (money < 0) {
			System.err.println("ERROR: Cannot add negative amount of money");
			return;
		}
		else {
			System.out.println("Added "+money+" to your account");
			changeBalance(money);
		}
	}
	public void reduceMoney(double money) {
		if (money < 0) {
			System.err.println("ERROR: Cannot reduce negative amount of money");
			return;
		}
		else {
			System.out.println("Reduced "+money+" from your account");
			changeBalance(-money);
		}
	}
}
