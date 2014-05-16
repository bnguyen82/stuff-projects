package abstractfactory.restaurant;

import abstractfactory.product.Beverage;
import abstractfactory.product.Pizza;
import abstractfactory.product.vn.VNBeverage;
import abstractfactory.product.vn.VNPizza;

public class VNPizzaRestaurant extends PizzaRestaurant {

	@Override
	public Beverage deliverBeverage() {
		return new VNBeverage();
	}

	@Override
	public Pizza deliverPizza() {
		return new VNPizza();
	}

}
