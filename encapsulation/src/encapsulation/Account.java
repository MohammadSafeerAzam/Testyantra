package encapsulation;

public class Account {
	private double balance;
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double amount) {
		this.balance=this.balance+amount;
	}

}
