package strategy.salarycalculator;

import abstractfactory.human.Employee;

public class SalaryCal {
	private Employee employee;
	private SalaryMethod salaryMan;
	public double monthSalary(){
		return getSalaryMan().calculateSalary(employee);
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setSalaryMan(Employee employee) {
		String local = employee.getLocal().getLanguage();
		if ("vn".equals(local)) {
			this.salaryMan = new VNSalaryMethod();
		} else if ("us".equals(local)){
			this.salaryMan = new USSalaryMethod();
		}
	}
	public SalaryMethod getSalaryMan() {
		return salaryMan;
	}
}
