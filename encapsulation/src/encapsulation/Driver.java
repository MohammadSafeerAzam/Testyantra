package encapsulation;
public class Driver {
	private String name;
	private double marks;
	private int id; 
	public String getName() {
		return this.name;
	}
	public double getMarks() {
		return this.marks;
	}
	public int getId() {
		return this.id;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setMarks(double m) {
		this.marks = this.marks + m;
	}
	public void setId(int i) {
		this.id = this.id + i;
	}

}
