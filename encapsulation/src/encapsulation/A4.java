package encapsulation;
public class A4 {
	public static void main(String[] args) {
		Driver a1 = new Driver();
		System.out.println(a1.getName());
		a1.setName("safeer");
		System.out.println(a1.getMarks());
		System.out.println(a1.getName());
		a1.setMarks(50.00);
		System.out.println(a1.getMarks());
		System.out.println(a1.getId());
		a1.setId(1);
		System.out.println(a1.getId());
	}

}
