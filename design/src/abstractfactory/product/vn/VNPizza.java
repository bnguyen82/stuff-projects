package abstractfactory.product.vn;

import abstractfactory.product.Pizza;
import abstractfactory.product.PizzaIngrements;

public class VNPizza extends Pizza {
	public VNPizza() {
		ingrements.put(PizzaIngrements.Anchovy, 40);
		ingrements.put(PizzaIngrements.Pepperoni, 50);
		ingrements.put(PizzaIngrements.Vegetable, 10);
	}
	@Override
	public boolean isFat() {
		// TODO Auto-generated method stub
		return true;
	}

}
