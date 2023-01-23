package encapsulation;
public class EndUser {
	public static void main(String[] args) {
		Bank b1 = new Bank("Raju", 2000.00);
		Bank b2 = new Bank("Safeer", 4000.00);
		Bank b3 = new Bank("Rohit", 6000.00);
		Bank b4 = new Bank("Ashish", 8000.00);
		System.out.println(b1.getName());
		System.out.println(b1.getBalance());
		System.out.println(b2.getName());
		System.out.println(b2.getBalance());
		System.out.println(b3.getName());
		System.out.println(b3.getBalance());
		System.out.println(b4.getName());
		System.out.println(b4.getBalance());
	}

}
