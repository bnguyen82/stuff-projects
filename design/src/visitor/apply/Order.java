package visitor.apply;

import java.util.Enumeration;
import java.util.Vector;

import visitor.visit.Visitable;
import visitor.visit.Visitor;

public class Order implements Visitable {
	private String name;
	private Vector<Item> vector = new Vector<Item>();
	public Order(String name, Item item) {
		// TODO Auto-generated constructor stub
		this.name = name;
		vector.add(item);
	}
	public void addItem(Item item){
		vector.add(item);
	}
	@Override
	public void accept(Visitor visit) {
		// TODO Auto-generated method stub
		for (Enumeration<Item> itemEnum = vector.elements(); itemEnum.hasMoreElements();){
			itemEnum.nextElement().accept(visit);
//			visit.visit(itemEnum.nextElement());
		}
		visit.visit(this);
	}
	public String getName() {
		return name;
	}

}
