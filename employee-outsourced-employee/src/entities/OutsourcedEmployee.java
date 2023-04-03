package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double addtionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double addtionalCharge) {
		super(name, hours, valuePerHours);
		this.addtionalCharge = addtionalCharge;
	}

	public Double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + addtionalCharge * 1.1;
	}
}
