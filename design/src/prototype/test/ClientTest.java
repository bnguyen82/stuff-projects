package prototype.test;

import abstractfactory.human.Employee;
import prototype.test.Business;

public class ClientTest {
public static void main(String[] args) {
	Business bus = new Business();
	Employee em = new Employee("us");
	bus.deliverProduct(em);
	Employee emVN = new Employee("vn");
	bus.deliverProduct(emVN);
	Employee emMY= new Employee("my");
	bus.deliverProduct(emMY);
}
}
