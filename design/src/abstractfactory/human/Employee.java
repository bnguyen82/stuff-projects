package abstractfactory.human;

import strategy.tax.Tax;

public class Employee extends People {
	public Employee(String local){
		super(local);
		type = 2;
	}
	private Tax imcomeTax;
	private int sales, baseSalary;
	private double commission;
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getSales() {
		return sales;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setImcomeTax(Tax imcomeTax) {
		this.imcomeTax = imcomeTax;
	}
	public Tax getImcomeTax() {
		return imcomeTax;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getCommission() {
		return commission;
	}
}
