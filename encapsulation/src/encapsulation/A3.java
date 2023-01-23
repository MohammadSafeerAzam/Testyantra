package encapsulation;

public class A3 {
	public static void main(String[] args) {
		Account a1 = new Account();
		System.out.println(a1.getBalance());
		a1.setBalance(1000);
		System.out.println(a1.getBalance());
		a1.setBalance(500);
		System.out.println(a1.getBalance());

	}

}
