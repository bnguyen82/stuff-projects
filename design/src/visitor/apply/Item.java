package visitor.apply;

import visitor.visit.Visitable;
import visitor.visit.Visitor;

public class Item implements Visitable{
	private String name;
	public Item(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void accept(Visitor visit) {
		// TODO Auto-generated method stub
		visit.visit(this);
	}
	public String getName() {
		return name;
	}
}
