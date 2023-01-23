package encapsulation;
public class Bank {
	private String name;
	private double balance;

	Bank(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}
}
