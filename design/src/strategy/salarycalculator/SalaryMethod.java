package strategy.salarycalculator;

import abstractfactory.human.Employee;

public interface SalaryMethod {
	public double calculateSalary(Employee employee);
}
