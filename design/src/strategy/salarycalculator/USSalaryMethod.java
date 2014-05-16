package strategy.salarycalculator;

import strategy.tax.IncomeTax;
import abstractfactory.human.Employee;

public class USSalaryMethod implements SalaryMethod {
	@Override
	public double calculateSalary(Employee employee) {
		// TODO Auto-generated method stub
		return employee.getBaseSalary() + employee.getCommission()*employee.getSales()*(1 - ((IncomeTax)employee.getImcomeTax()).getIncomeTaxRatio());
	}
}
