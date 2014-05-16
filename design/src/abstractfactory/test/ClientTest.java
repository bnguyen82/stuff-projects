package abstractfactory.test;

import abstractfactory.human.Employee;

public class ClientTest {
	public static void main(String[] args) {
		Business bus = new Business();
		Employee em = new Employee("us");
		bus.deliverProduct(em);
		Employee emVN = new Employee("vn");
		bus.deliverProduct(emVN);
	}
}
