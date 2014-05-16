package visitor.visit;

import visitor.apply.Customer;
import visitor.apply.Item;
import visitor.apply.Order;

public interface Visitor {
	void visit(Item item);
	void visit(Order order);
	void visit(Customer cust);
}
