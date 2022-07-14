package mypackage;

public class Employee {
	private String name;
	private float Number;
	private float PIN;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getNumber() {
		return Number;
	}
	public void setNumber(float Number) {
		this.Number = Number;
	}
	public void setPIN(float PIN) { 
		this.PIN = PIN;
	}
	
	public Employee() {
		this.name="Unknown";
		this.Number=0.0f;
	}
	public Employee(String name, float rate, float PIN) {
		this.name=name;
		this.Number=rate;
		this.PIN=PIN;
	}
	
	public void salary() {
		System.out.println(name + " annual salary is " + Number*50*40);

	}

}
