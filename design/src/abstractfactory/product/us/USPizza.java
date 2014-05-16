package abstractfactory.product.us;

import abstractfactory.product.Pizza;
import abstractfactory.product.PizzaIngrements;

public class USPizza extends Pizza {
	public USPizza(){
		ingrements.put(PizzaIngrements.Anchovy, 30);
		ingrements.put(PizzaIngrements.Pepperoni, 40);
		ingrements.put(PizzaIngrements.Vegetable, 40);
	}
	@Override
	public boolean isFat() {
		// TODO Auto-generated method stub
		return false;
	}
}
