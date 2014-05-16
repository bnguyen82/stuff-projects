package visitor.apply;

import java.util.Enumeration;
import java.util.Vector;

import com.sun.org.apache.xpath.internal.operations.Or;

import visitor.visit.Visitable;
import visitor.visit.Visitor;

public class Customer implements Visitable {
	private String name;
	private Vector<Order> orders = new Vector<Order>();
	public Customer(String name, Order order){
		// TODO Auto-generated constructor stub
		this.name = name;
		orders.add(order);
	}
	@Override
	public void accept(Visitor visit) {
		// TODO Auto-generated method stub
		for (Enumeration<Order> orderList = orders.elements(); orderList.hasMoreElements();){
//			visit.visit(orderList.nextElement());
			orderList.nextElement().accept(visit);
			
		}
		visit.visit(this);
	}
	public void addOrder(Order order){
		orders.add(order);
	}
}
