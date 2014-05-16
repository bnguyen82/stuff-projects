package strategy.test;

import java.util.Locale;

import abstractfactory.human.Employee;
import strategy.salarycalculator.SalaryCal;
import strategy.tax.IncomeTax;

public class StrategyTest {

	public static void main(String[] args) {
		SalaryCal cal = new SalaryCal();
		IncomeTax imcomeTax1 = new IncomeTax();
		imcomeTax1.setIncomeTaxRatio(0.05);
		IncomeTax imcomeTax2 = new IncomeTax();
		imcomeTax2.setIncomeTaxRatio(0.3);
		
		//Employee 1
		Employee employee1 = new Employee("vn");
		employee1.setBaseSalary(2000);
		employee1.setCommission(0.1);
		employee1.setSales(10000);
		employee1.setImcomeTax(imcomeTax2);
		
		cal.setSalaryMan(employee1);
		cal.setEmployee(employee1);
		System.out.println("Employee 1 salary: "+cal.monthSalary());
		
		//Employee 2
		
		Employee employee2 = new Employee("us");
		employee2.setBaseSalary(2000);
		employee2.setCommission(0.1);
		employee2.setSales(10000);
		employee2.setImcomeTax(imcomeTax2);
		
		cal.setSalaryMan(employee2);
		cal.setEmployee(employee2);
		System.out.println("Employee 2 salary: "+cal.monthSalary());
	}

}
