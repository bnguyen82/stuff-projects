package visitor.visit;

import visitor.apply.Customer;
import visitor.apply.Item;
import visitor.apply.Order;

public class CountingReport implements Visitor {
	private static int numItem;
	private static int numOrder;
	private static int numCust;
	@Override
	public void visit(Item item) {
		// TODO Auto-generated method stub
		numItem++;
	}
	@Override
	public void visit(Order order) {
		// TODO Auto-generated method stub
		numOrder++;
	}
	@Override
	public void visit(Customer cust) {
		// TODO Auto-generated method stub
		numCust++;
	}

}
