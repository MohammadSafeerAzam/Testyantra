package encapsulation;

public class A2 extends A1{
	public static void main(String[] args) {
		A1 a2=new A1();
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a2.c);
		A1 a1=new A2(); //UPCASTING
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.b);
		
	}

}
