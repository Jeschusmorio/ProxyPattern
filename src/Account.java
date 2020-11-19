
public interface Account {
	public void setBalance(double newBalance);
	public double getBalance();
	public void setAccountID(int newAccountID);
	public int getAccountID();
	public void setName(String name);
	public String getName();
	public void printAccount();
	public void addMoney(double money);
	public void reduceMoney(double money);
}
