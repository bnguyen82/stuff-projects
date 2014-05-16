package visitor.apply;

import java.util.ArrayList;

import visitor.visit.CountingReport;
import visitor.visit.Visitor;

public class VisitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor visitor1 = new CountingReport();
		Item item1 = new Item("Kindle");
		Item item2 = new Item("Kindle case");
		Order order1 = new Order("Chrismas", item1);
		order1.addItem(item2);
		Customer cus1 = new Customer("Hoang", order1);

		Item item3 = new Item("Ipad");
		Item item4 = new Item("Ipad headsets");
		Item item5 = new Item("Iphone");
		Order order2 = new Order("New year", item3);
		order2.addItem(item4);
		Order order3 = new Order("New year", item5);
		Customer cus2 = new Customer("Ha", order2);
		cus2.addOrder(order3);
		
//		item1.accept(visitor1);
//		item2.accept(visitor1);
//		item3.accept(visitor1);
//		item4.accept(visitor1);
//		item5.accept(visitor1);
//		order1.accept(visitor1);
//		order2.accept(visitor1);
//		order3.accept(visitor1);
		cus1.accept(visitor1);
		cus2.accept(visitor1);
		
	}

}
