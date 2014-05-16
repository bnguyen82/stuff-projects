package strategy.salarycalculator;

import strategy.tax.IncomeTax;
import abstractfactory.human.Employee;

public class VNSalaryMethod implements SalaryMethod {
	
	@Override
	public double calculateSalary(Employee employee) {
		// TODO Auto-generated method stub
		return (employee.getBaseSalary() + employee.getCommission()*employee.getSales()*((IncomeTax)employee.getImcomeTax()).getIncomeTaxRatio())
				* (1 - ((IncomeTax)employee.getImcomeTax()).getIncomeTaxRatio());
	}
}
